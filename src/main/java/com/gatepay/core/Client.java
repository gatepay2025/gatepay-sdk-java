package com.gatepay.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gatepay.common.BaseRequest;
import com.gatepay.common.GatePayConstants;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.core.signature.Sign;

import java.lang.reflect.Field;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;


public class Client {

    private static HttpClient httpClient;
    private static Credential credential;
    private static Config config;

    static {
        config = new Config();
        credential = new Credential("Mz6M_q4AkDnZCSoTDo03A6OtWzN5ut8_Uix3jyVjxAU=");
    }

    public static HttpClient generateHttpClient() {
        return HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(60))
                .build();
    }

    public static <T extends BaseRequest> HttpRequest generateHttpRequest(T request, long timestamp, String nonce) throws IllegalAccessException, JsonProcessingException {
        HttpRequest.Builder builder = HttpRequest.newBuilder()
                .header(GatePayConstants.HEADER_CONTENT_TYPE, "application/json")
                .header(GatePayConstants.HEADER_GATEPAY_TIMESTAMP, String.valueOf(timestamp))
                .header(GatePayConstants.HEADER_GATEPAY_NONCE, nonce)
                // TODO: set new api key
                .header(GatePayConstants.HEADER_GATEPAY_CERTIFICATE_CLIENT_ID, "mZ96D37oKk-HrWJc");   // apiKey)
        if (GatePayConstants.METHOD_GET.equals(request.getApi().getHttpMethod()) || GatePayConstants.METHOD_DELETE.equals(request.getApi().getHttpMethod())) {
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
            builder.header(GatePayConstants.HEADER_GATEPAY_SIGNATURE, Sign.verifySignature(String.valueOf(timestamp), nonce, "", credential.getSecretKey()));
            builder.uri(URI.create(config.getEndpoint() + request.getApi().getUrl() + paramStr));
            return GatePayConstants.METHOD_GET.equals(request.getApi().getHttpMethod()) ? builder.GET().build() : builder.DELETE().build();
        }
        if (GatePayConstants.METHOD_POST.equals(request.getApi().getHttpMethod())) {
            // TODO: check api key
            builder.header(GatePayConstants.HEADER_GATEPAY_API_KEY, "SkZlbKOqPoMwnxhl");
            builder.header(GatePayConstants.HEADER_GATEPAY_SIGNATURE, Sign.verifySignature(String.valueOf(timestamp), nonce, new ObjectMapper().writeValueAsString(request), credential.getSecretKey()));
            builder.uri(URI.create(config.getEndpoint() + request.getApi().getUrl()));
            return builder.POST(HttpRequest.BodyPublishers.ofString(new ObjectMapper().writeValueAsString(request))).build();
        }
        if (GatePayConstants.METHOD_PUT.equals(request.getApi().getHttpMethod())) {
            builder.header(GatePayConstants.HEADER_GATEPAY_API_KEY, "SkZlbKOqPoMwnxhl");
            builder.header(GatePayConstants.HEADER_GATEPAY_SIGNATURE, Sign.verifySignature(String.valueOf(timestamp), nonce, new ObjectMapper().writeValueAsString(request), credential.getSecretKey()));
            builder.uri(URI.create(config.getEndpoint() + request.getApi().getUrl()));
            return builder.PUT(HttpRequest.BodyPublishers.ofString(new ObjectMapper().writeValueAsString(request))).build();
        }
        return null;
    }



    public HttpClient getHttpClient() {
        return httpClient;
    }

    public void setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

}
