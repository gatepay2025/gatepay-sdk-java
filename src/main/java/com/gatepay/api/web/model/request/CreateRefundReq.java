package com.gatepay.api.web.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;


public class CreateRefundReq extends BaseRequest {

    @GatePayParam
    private String refundRequestId;

    @GatePayParam
    private String prepayId;

    @GatePayParam
    private String refundAmount;


    public CreateRefundReq() {
        this.api = GatePayApi.PAY_CREATE_REFUND;
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
