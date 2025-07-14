package com.gatepay.model.address.request;

import com.gatepay.common.BaseRequest;

public class ChainsRequest extends BaseRequest {

    private String currency;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
