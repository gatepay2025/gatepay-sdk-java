package com.gatepay.service.address.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.GatePayConstants;
import com.gatepay.common.annotation.GatePayParam;

public class TransactionDetailReq extends BaseRequest {

    @GatePayParam
    private String prepayId;

    public TransactionDetailReq() {
        this.requestUrl = GatePayConstants.END_POINT_ADDRESS_TRANSACTION_DETAIL;
        this.requestMethod = GatePayConstants.METHOD_GET;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

}
