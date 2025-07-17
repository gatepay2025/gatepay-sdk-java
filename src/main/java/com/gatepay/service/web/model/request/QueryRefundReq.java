package com.gatepay.service.web.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;


public class QueryRefundReq extends BaseRequest {

    @GatePayParam
    private String refundRequestId;

    public QueryRefundReq() {
        this.api = GatePayApi.PAY_QUERY_REFUND;
    }

    public String getRefundRequestId() {
        return refundRequestId;
    }

    public void setRefundRequestId(String refundRequestId) {
        this.refundRequestId = refundRequestId;
    }

}
