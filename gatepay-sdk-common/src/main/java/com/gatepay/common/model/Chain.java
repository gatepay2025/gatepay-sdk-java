/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Description 链信息
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class Chain {

    /**
     * 链类型
     */
    @JsonProperty("chain_type")
    private String chainType;

    /**
     * 链地址
     */
    private String address;

    /**
     * 链币种类型
     */
    private String fullCurrType;


    public String getChainType() {
        return chainType;
    }

    public void setChainType(String chainType) {
        this.chainType = chainType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullCurrType() {
        return fullCurrType;
    }

    public void setFullCurrType(String fullCurrType) {
        this.fullCurrType = fullCurrType;
    }

}
