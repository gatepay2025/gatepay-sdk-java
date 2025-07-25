package com.gatepay.core.api.withdraw.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;


public class QueryStatusReq extends BaseRequest {

    @GatePayParam
    private String currency;


    public QueryStatusReq() {
        this.api = GatePayApi.WITHDRAW_QUERY_STATUS;
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
