package com.gatepay.core.api.address.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;


public class TransactionDetailReq extends BaseRequest {

    @GatePayParam
    private String prepayId;

    public TransactionDetailReq() {
        this.api = GatePayApi.ADDRESS_TRANSACTION_DETAIL;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

}
