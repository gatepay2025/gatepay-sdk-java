package com.gatepay.api.address.model.resp;

import com.gatepay.common.BaseResponse;
import com.gatepay.common.model.Chain;

public class CreateOrderResp extends BaseResponse<CreateOrderResp> {

    private String prepayId;
    private String terminalType;
    private long expireTime;
    private Chain chain;


    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
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

    public void setExpireTime(long expireTime) {
        this.expireTime = expireTime;
    }

    public Chain getChain() {
        return chain;
    }

    public void setChain(Chain chain) {
        this.chain = chain;
    }

}
