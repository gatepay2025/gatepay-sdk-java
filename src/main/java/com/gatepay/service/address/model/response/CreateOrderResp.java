package com.gatepay.service.address.model.response;

import com.gatepay.service.address.model.Chain;

public class CreateOrderResp {

    private String prepayID;
    private String terminalType;
    private int expireTime;
    private Chain chain;


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

    public Chain getChain() {
        return chain;
    }

    public void setChain(Chain chain) {
        this.chain = chain;
    }

}
