package com.gatepay.core.security;

public class Credential {

    private String secretKey;
    private String apiKey;

    public Credential(String secretKey, String apiKey) {
        this.secretKey = secretKey;
        this.apiKey = apiKey;
    }


    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

}
