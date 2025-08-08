/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.bill;

import com.gatepay.core.api.BaseApi;
import com.gatepay.core.api.bill.model.req.QueryOrdersReq;
import com.gatepay.core.api.bill.model.resp.QueryOrdersResp;
import com.gatepay.infrastructure.GatePayConfig;

/**
 * @Description 账单api
 * @Author ZJ-BE
 * @Date 2025/7/25
 */
public class ApiBill extends BaseApi {

    public ApiBill(GatePayConfig gatePayConfig) {
        super(gatePayConfig);
    }

    /**
     * 查询账单
     * @param request
     * @return
     */
    public QueryOrdersResp queryOrders(QueryOrdersReq request) {
        return super.process(request, QueryOrdersResp.class);
    }

}
