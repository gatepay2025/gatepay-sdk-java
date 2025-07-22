package com.gatepay.api.withdraw.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;

public class QueryBalanceReq extends BaseRequest {

    private String currency;


    public QueryBalanceReq() {
        this.api = GatePayApi.WITHDRAW_QUERY_BALANCE;
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
