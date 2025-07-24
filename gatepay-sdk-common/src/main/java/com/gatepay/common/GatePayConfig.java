package com.gatepay.common;

import com.gatepay.common.security.Credential;

import java.time.Duration;


public class GatePayConfig {

    private String scheme;
    private String endPoint;
    private Duration timeout;
    private String clientId;
    private Credential credential;


    public GatePayConfig(String endPoint, long timeoutInSeconds, String clientId, Credential credential) {
        this.scheme = GatePayConstants.SCHEME_HTTPS;
        this.endPoint = endPoint;
        this.timeout = Duration.ofSeconds(timeoutInSeconds);
        this.clientId = clientId;
        this.credential = credential;
    }


    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public Duration getTimeout() {
        return timeout;
    }

    public void setTimeout(Duration timeout) {
        this.timeout = timeout;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }
}
