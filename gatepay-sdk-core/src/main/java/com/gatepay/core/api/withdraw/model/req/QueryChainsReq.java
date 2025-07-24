package com.gatepay.core.api.withdraw.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;


public class QueryChainsReq extends BaseRequest {

    @GatePayParam
    private String currency;


    public QueryChainsReq() {
        this.api = GatePayApi.WITHDRQW_CURRENCY_CHAINS;
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
