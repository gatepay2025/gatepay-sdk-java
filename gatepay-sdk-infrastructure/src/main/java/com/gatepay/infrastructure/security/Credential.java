/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.infrastructure.security;

/**
 * @Description 密钥类
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class Credential {

    /**
     * 商户密钥
     */
    private String secretKey;

    /**
     * 商户api密钥
     */
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
