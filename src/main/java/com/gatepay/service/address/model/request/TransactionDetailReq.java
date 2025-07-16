package com.gatepay.service.address.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.GatePayConstants;

public class TransactionDetailReq extends BaseRequest {

    private String prepayId;

    public TransactionDetailReq() {
        this.requestUrl = super.requestUrl + GatePayConstants.END_POINT_ADDRESS_TRANSACTION_DETAIL;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

}
