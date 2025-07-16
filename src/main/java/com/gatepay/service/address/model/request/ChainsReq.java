package com.gatepay.service.address.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.GatePayConstants;

public class ChainsReq extends BaseRequest {

    private String currency;

    public ChainsReq() {
        this.requestUrl = super.requestUrl + GatePayConstants.END_POINT_ADDRESS_CHAINS;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
