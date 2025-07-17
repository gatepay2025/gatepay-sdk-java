package com.gatepay.service.web.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.GatePayConstants;
import com.gatepay.common.annotation.GatePayParam;


public class CreateRefundReq extends BaseRequest {

    @GatePayParam
    private String refundRequestId;

    @GatePayParam
    private String prepayId;

    @GatePayParam
    private String refundAmount;


    public CreateRefundReq() {
        this.requestUrl = GatePayConstants.END_POINT_PAY_CREATE_REFUND;
        this.requestMethod = GatePayConstants.METHOD_POST;
    }


    public String getRefundRequestId() {
        return refundRequestId;
    }

    public void setRefundRequestId(String refundRequestId) {
        this.refundRequestId = refundRequestId;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

}
