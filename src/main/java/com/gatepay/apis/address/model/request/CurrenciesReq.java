package com.gatepay.apis.address.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;

public class CurrenciesReq extends BaseRequest {

    public CurrenciesReq() {
        this.api = GatePayApi.ADDRESS_CURRENCIES;
    }

}
