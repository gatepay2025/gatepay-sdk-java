package com.gatepay.api.withdraw.model.req;

import com.gatepay.common.BaseRequest;
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
