package com.gatepay.api;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.BaseResponse;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.core.Client;
import com.gatepay.core.signature.Nonce;

import java.lang.reflect.Field;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class BaseApi {

    private <Req extends BaseRequest> boolean preprocess(Req req) throws IllegalAccessException {
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

    protected <Req extends BaseRequest, Resp extends BaseResponse> Resp process(Req req, Class<Resp> respClass) {
        try {
            preprocess(req);
            HttpRequest httpRequest = Client.generateHttpRequest(req, System.currentTimeMillis(), Nonce.generateNonce(9));
            HttpResponse<String> httpResponse = Client.generateHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(httpResponse.body().toString());
            return respClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
