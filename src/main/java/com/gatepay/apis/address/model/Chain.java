package com.gatepay.apis.address.model;

import com.gatepay.common.BaseRequest;


public class Chain extends BaseRequest {

    private String chainType;
    private String address;
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
