package com.gatepay.core.api.payment.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;


public class QueryBalanceReq extends BaseRequest {

    public QueryBalanceReq() {
        this.api = GatePayApi.PAYMENT_QUERY_BALANCE;
    }

}
