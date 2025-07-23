package com.gatepay.api.bill;

import com.gatepay.api.BaseApi;
import com.gatepay.api.bill.model.req.QueryOrdersReq;
import com.gatepay.api.bill.model.resp.QueryOrdersResp;
import com.gatepay.core.GatePayConfig;


public class ApiBill extends BaseApi {

    public ApiBill(GatePayConfig gatePayConfig) {
        super(gatePayConfig);
    }

    public QueryOrdersResp queryOrders(QueryOrdersReq request) {
        return super.process(request, QueryOrdersResp.class);
    }

}
