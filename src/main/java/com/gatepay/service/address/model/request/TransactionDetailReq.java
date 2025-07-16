package com.gatepay.service.address.model.request;

import com.gatepay.common.BaseRequest;

public class TransactionDetailReq extends BaseRequest {

    private String prepayId;


    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

}
