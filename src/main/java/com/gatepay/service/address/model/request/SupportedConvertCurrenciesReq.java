package com.gatepay.service.address.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.GatePayConstants;

public class SupportedConvertCurrenciesReq extends BaseRequest {

    private String currency;

    public SupportedConvertCurrenciesReq() {
        this.requestUrl = super.requestUrl + GatePayConstants.END_POINT_ADDRESS_SUPPORTED_CONVERT_CURRENCIES;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
