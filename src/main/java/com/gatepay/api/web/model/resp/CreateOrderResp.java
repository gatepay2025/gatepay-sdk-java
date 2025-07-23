package com.gatepay.api.web.model.resp;

import com.gatepay.common.BaseResponse;

public class CreateOrderResp extends BaseResponse<CreateOrderResp> {

    private String prepayId;
    private String terminalType;
    private long expireTime;

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

}
