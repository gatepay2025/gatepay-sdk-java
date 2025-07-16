package com.gatepay.core;

import com.gatepay.constants.EndPoints;

import java.time.Duration;

public class Config {

    private String scheme;
    private String endpoint;
    private Duration timeout;


    public Config() {
        this.scheme = "https";
        this.endpoint = EndPoints.DEFAULT_END_POINT;
        this.timeout = Duration.ofSeconds(30);
    }


    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public Duration getTimeout() {
        return timeout;
    }

    public void setTimeout(Duration timeout) {
        this.timeout = timeout;
    }

}
