package com.gatepay.api.address.model;


public class Chain {

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
