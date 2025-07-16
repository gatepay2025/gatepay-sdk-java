package com.gatepay.service.address.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.GatePayConstants;
import com.gatepay.common.annotation.GatePayRequestParam;

public class TransactionDetailReq extends BaseRequest {

    @GatePayRequestParam
    private String prepayId;

    public TransactionDetailReq() {
        this.requestUrl = GatePayConstants.END_POINT_ADDRESS_TRANSACTION_DETAIL;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

}
