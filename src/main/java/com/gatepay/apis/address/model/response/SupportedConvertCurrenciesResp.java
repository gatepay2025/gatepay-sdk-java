package com.gatepay.apis.address.model.response;

import com.gatepay.common.BaseResponse;

public class SupportedConvertCurrenciesResp extends BaseResponse {

    private String[] currencies;


    public String[] getCurrencies() {
        return currencies;
    }

    public void setCurrencies(String[] currencies) {
        this.currencies = currencies;
    }

}
