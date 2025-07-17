package com.gatepay.service.address.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.GatePayConstants;
import com.gatepay.common.annotation.GatePayParam;

public class SupportedConvertCurrenciesReq extends BaseRequest {

    @GatePayParam
    private String currency;

    public SupportedConvertCurrenciesReq() {
        this.requestUrl = GatePayConstants.END_POINT_ADDRESS_SUPPORTED_CONVERT_CURRENCIES;
        this.requestMethod = GatePayConstants.METHOD_GET;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
