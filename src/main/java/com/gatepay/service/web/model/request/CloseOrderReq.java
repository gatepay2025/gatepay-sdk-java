package com.gatepay.service.web.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.GatePayConstants;
import com.gatepay.common.annotation.GatePayParam;

public class CloseOrderReq extends BaseRequest {

    @GatePayParam
    private String prepayId;

    public CloseOrderReq() {
        this.requestUrl = GatePayConstants.END_POINT_PAY_ORDER_CLOSE;
        this.requestMethod = GatePayConstants.METHOD_POST;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

}
