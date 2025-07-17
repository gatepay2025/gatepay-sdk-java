package com.gatepay.api.address.model.response;

import com.gatepay.common.BaseResponse;
import com.gatepay.api.address.model.Chain;

public class CreateOrderResp extends BaseResponse {

    private String prepayID;
    private String terminalType;
    private long expireTime;
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

    public long getExpireTime() {
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
