package com.gatepay.api.web.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;


public class QueryBalanceReq extends BaseRequest {

    public QueryBalanceReq() {
        this.api = GatePayApi.PAY_QUERY_BALANCE;
    }

}
