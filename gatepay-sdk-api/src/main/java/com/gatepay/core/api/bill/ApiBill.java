/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.bill;

import com.gatepay.common.GatePayConfig;
import com.gatepay.core.api.BaseApi;
import com.gatepay.core.api.bill.model.req.QueryOrdersReq;
import com.gatepay.core.api.bill.model.resp.QueryOrdersResp;


public class ApiBill extends BaseApi {

    public ApiBill(GatePayConfig gatePayConfig) {
        super(gatePayConfig);
    }

    public QueryOrdersResp queryOrders(QueryOrdersReq request) {
        return super.process(request, QueryOrdersResp.class);
    }

}
