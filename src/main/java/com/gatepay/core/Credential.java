package com.gatepay.core;

public class Credential {

    private String secretKey;

    public Credential(String secretKey) {
        this.secretKey = secretKey;
    }


    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

}
