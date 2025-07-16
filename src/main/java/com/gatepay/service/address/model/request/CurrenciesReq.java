package com.gatepay.service.address.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.GatePayConstants;

public class CurrenciesReq extends BaseRequest {

    public CurrenciesReq() {
        this.requestUrl = GatePayConstants.END_POINT_ADDRESS_CURRENCIES;
        this.requestMethod = GatePayConstants.METHOD_GET;
    }

}
