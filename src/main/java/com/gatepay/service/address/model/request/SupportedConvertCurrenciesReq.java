package com.gatepay.service.address.model.request;

import com.gatepay.common.BaseRequest;

public class SupportedConvertCurrenciesReq extends BaseRequest {

    private String currency;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
