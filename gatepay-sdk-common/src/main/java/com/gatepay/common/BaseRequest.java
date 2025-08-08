/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.common;

import com.gatepay.common.enums.GatePayApi;

import java.util.HashMap;
import java.util.Map;


/**
 * @Description 基础请求类
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class BaseRequest {

    protected GatePayApi api;
    private Map<String, String> headers;
    private String version;

    public BaseRequest() {
        this.headers = new HashMap<>();
    }

    public BaseRequest(String version) {
        this.headers = new HashMap<>();
        this.version = version;
    }

    public GatePayApi getApi() {
        return api;
    }

    public void setApi(GatePayApi api) {
        this.api = api;
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
