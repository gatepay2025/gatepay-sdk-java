/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.security.Signature;

import java.lang.reflect.Field;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;



public class GatePayHttpClient {

    private GatePayConfig gatePayConfig;
    private HttpClient httpClient;

    public GatePayHttpClient(GatePayConfig gatePayConfig) {
        this.gatePayConfig = gatePayConfig;
        this.httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(gatePayConfig.getTimeout())
                .build();
    }

    public <T extends BaseRequest> HttpRequest generateHttpRequest(T request, long timestamp, String nonce) throws IllegalAccessException, JsonProcessingException {
        HttpRequest.Builder builder = HttpRequest.newBuilder()
                .header(GatePayConstants.HEADER_CONTENT_TYPE, GatePayConstants.HEADER_APPLICATION_JSON)
                .header(GatePayConstants.HEADER_GATEPAY_TIMESTAMP, String.valueOf(timestamp))
                .header(GatePayConstants.HEADER_GATEPAY_NONCE, nonce)
                .header(GatePayConstants.HEADER_GATEPAY_CERTIFICATE_CLIENT_ID, this.gatePayConfig.getClientId());
        if (GatePayConstants.METHOD_GET.equals(request.getApi().getHttpMethod())) {
            populateBuilderForGetDelete(request, builder, timestamp, nonce);
            return builder.GET().build();
        }
        if (GatePayConstants.METHOD_DELETE.equals(request.getApi().getHttpMethod())) {
            populateBuilderForGetDelete(request, builder, timestamp, nonce);
            return builder.DELETE().build();
        }
        if (GatePayConstants.METHOD_POST.equals(request.getApi().getHttpMethod())) {
            populateBuilderForPostPut(request, builder, timestamp, nonce);
            return builder.POST(HttpRequest.BodyPublishers.ofString(new ObjectMapper().writeValueAsString(request))).build();
        }
        if (GatePayConstants.METHOD_PUT.equals(request.getApi().getHttpMethod())) {
            populateBuilderForPostPut(request, builder, timestamp, nonce);
            return builder.PUT(HttpRequest.BodyPublishers.ofString(new ObjectMapper().writeValueAsString(request))).build();
        }
        return null;
    }

    private <T extends BaseRequest> void populateBuilderForGetDelete(T request, HttpRequest.Builder builder, long timestamp, String nonce) throws IllegalAccessException {
        String paramStr = "";
        Field[] declaredFields = request.getClass().getDeclaredFields();
        if (declaredFields != null && declaredFields.length > 0)  {
            for (Field field : declaredFields) {
                field.setAccessible(Boolean.TRUE);
                if (field.isAnnotationPresent(GatePayParam.class) && field.get(request) != null) {
                    paramStr = paramStr == "" ? paramStr + "?" : paramStr + "&";
                    paramStr = paramStr + field.getName() + "=" + field.get(request);
                }
            }
        }
        builder.header(GatePayConstants.HEADER_GATEPAY_SIGNATURE, Signature.verifySignature(String.valueOf(timestamp), nonce, "", this.gatePayConfig.getCredential().getSecretKey()));
        builder.uri(URI.create(this.gatePayConfig.getEndPoint() + request.getApi().getUrl() + paramStr));
    }

    private <T extends BaseRequest> void populateBuilderForPostPut(T request, HttpRequest.Builder builder, long timestamp, String nonce) throws JsonProcessingException {
        builder.header(GatePayConstants.HEADER_GATEPAY_API_KEY, this.gatePayConfig.getCredential().getApiKey());
        builder.header(GatePayConstants.HEADER_GATEPAY_SIGNATURE, Signature.verifySignature(String.valueOf(timestamp), nonce, new ObjectMapper().writeValueAsString(request), this.gatePayConfig.getCredential().getSecretKey()));
        builder.uri(URI.create(this.gatePayConfig.getEndPoint() + request.getApi().getUrl()));
    }

    public HttpClient getHttpClient() {
        return httpClient;
    }

    public void setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

}
