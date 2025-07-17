package com.gatepay.service.web.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;


public class CloseOrderReq extends BaseRequest {

    @GatePayParam
    private String prepayId;

    public CloseOrderReq() {
        this.api = GatePayApi.PAY_ORDER_CLOSE;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

}
