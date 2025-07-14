package com.gatepay.common;

import java.util.HashMap;
import java.util.Map;


public class BaseRequest {

    private Map<String, String> headers;
    private String version;

    public BaseRequest() {
        this.headers = new HashMap<>();
    }

    public BaseRequest(String version) {
        this.headers = new HashMap<>();
        this.version = version;
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
