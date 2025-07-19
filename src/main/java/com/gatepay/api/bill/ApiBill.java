package com.gatepay.api.bill;

import com.gatepay.api.BaseApi;
import com.gatepay.api.bill.model.request.QueryOrdersReq;
import com.gatepay.api.bill.model.response.QueryOrdersResp;


public class ApiBill extends BaseApi {

    public QueryOrdersResp queryOrders(QueryOrdersReq request) {
        return super.process(request, QueryOrdersResp.class);
    }

}
