package com.gatepay.core.api.address.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;

public class ChainsReq extends BaseRequest {

    @GatePayParam
    private String currency;

    public ChainsReq() {
        this.api = GatePayApi.ADDRESS_CHAINS;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
