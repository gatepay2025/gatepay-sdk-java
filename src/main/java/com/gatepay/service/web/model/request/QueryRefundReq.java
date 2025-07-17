package com.gatepay.service.web.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.GatePayConstants;
import com.gatepay.common.annotation.GatePayParam;

public class QueryRefundReq extends BaseRequest {

    @GatePayParam
    private String refundRequestId;

    public QueryRefundReq() {
        this.requestUrl = GatePayConstants.END_POINT_PAY_QUERY_REFUND;
        this.requestMethod = GatePayConstants.METHOD_POST;
    }

    public String getRefundRequestId() {
        return refundRequestId;
    }

    public void setRefundRequestId(String refundRequestId) {
        this.refundRequestId = refundRequestId;
    }

}
