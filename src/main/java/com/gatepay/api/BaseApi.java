package com.gatepay.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gatepay.common.BaseRequest;
import com.gatepay.common.BaseResponse;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.annotation.GatePayRespData;
import com.gatepay.common.model.resp.SpecResp;
import com.gatepay.core.GatePayHttpClient;
import com.gatepay.core.GatePayConfig;
import com.gatepay.utils.RandomUtils;
import com.gatepay.utils.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class BaseApi {

    private GatePayHttpClient gatePayHttpClient;

    public BaseApi(GatePayConfig gatePayConfig) {
        this.gatePayHttpClient = new GatePayHttpClient(gatePayConfig);
    }


    private <Req extends BaseRequest> boolean preProcess(Req req) throws IllegalAccessException {
        for (Field field : req.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(GatePayParam.class) && field.getAnnotation(GatePayParam.class).required()) {
                field.setAccessible(Boolean.TRUE);
                if (field.get(req) == null) {
                    throw new RuntimeException("Field " + field.getName() + " is required!");
                }
            }
        }
        return Boolean.TRUE;
    }

    private <Resp extends BaseResponse> Resp postProcess(String json, Class<Resp> respClass) throws JsonProcessingException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        if (StringUtils.isEmpty(json)) {
            return respClass.getDeclaredConstructor().newInstance();
        }
        boolean existGatePayRespData = false;
        for (Field field : respClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(GatePayRespData.class)) {
                existGatePayRespData = true;
                break;
            }
        }
        if (existGatePayRespData) {
            SpecResp<Resp> specResp = new SpecResp();
            specResp.setData(respClass.newInstance());
            SpecResp returnSpecResp = new ObjectMapper().readValue(json, specResp.getClass());
            Resp resp = respClass.newInstance();
            resp.setCode(returnSpecResp.getCode());
            resp.setStatus(returnSpecResp.getStatus());
            resp.setLabel(returnSpecResp.getLabel());
            resp.setErrorMessage(returnSpecResp.getErrorMessage());
            resp.setData(returnSpecResp.getData());
            return resp;
        }
        return new ObjectMapper().readValue(json, respClass);
    }

    protected <Req extends BaseRequest, Resp extends BaseResponse> Resp process(Req req, Class<Resp> respClass) {
        try {
            preProcess(req);
            HttpRequest httpRequest = this.gatePayHttpClient.generateHttpRequest(req, System.currentTimeMillis(), RandomUtils.generateNonce(9));
            HttpResponse<String> httpResponse = this.gatePayHttpClient.getHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(httpResponse.body().toString());
            return postProcess(httpResponse.body().toString(), respClass);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
