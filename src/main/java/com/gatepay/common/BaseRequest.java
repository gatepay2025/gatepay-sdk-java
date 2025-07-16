package com.gatepay.common;

import java.util.HashMap;
import java.util.Map;


public class BaseRequest {

    protected String requestUrl = GatePayConstants.END_POINT_DEFAULT;
    protected String requestMethod;
    private Map<String, String> headers;
    private String version;

    public BaseRequest() {
        this.headers = new HashMap<>();
    }

    public BaseRequest(String version) {
        this.headers = new HashMap<>();
        this.version = version;
    }


    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public void addHeader(String key, String value) {
        if (this.headers == null) {
            this.headers = new HashMap<>();
        }
        this.headers.put(key, value);
    }

}
