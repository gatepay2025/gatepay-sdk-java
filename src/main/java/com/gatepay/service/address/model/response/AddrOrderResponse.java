package com.gatepay.service.address.model.response;

import com.gatepay.service.address.model.Chain;

public class AddrOrderResponse {

    private String prepayID;
    private String terminalType;
    private int expireTime;
    private Chain chainInfo;


    public String getPrepayID() {
        return prepayID;
    }

    public void setPrepayID(String prepayID) {
        this.prepayID = prepayID;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public int getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(int expireTime) {
        this.expireTime = expireTime;
    }

    public Chain getChainInfo() {
        return chainInfo;
    }

    public void setChainInfo(Chain chainInfo) {
        this.chainInfo = chainInfo;
    }

}
