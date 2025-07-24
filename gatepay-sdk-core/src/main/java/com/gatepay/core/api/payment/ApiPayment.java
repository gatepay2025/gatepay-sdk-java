package com.gatepay.core.api.payment;

import com.gatepay.core.api.BaseApi;
import com.gatepay.core.api.payment.model.req.OperateOrderReq;
import com.gatepay.core.api.payment.model.resp.QueryOrderResp;
import com.gatepay.common.GatePayConfig;


public class ApiPayment extends BaseApi {

    public ApiPayment(GatePayConfig gatePayConfig) {
        super(gatePayConfig);
    }

    // todo
    public QueryOrderResp getOrder(OperateOrderReq request) throws Exception {
        try {
            String url = "/api/v1/payment/query";
            return null;
        } catch (Exception e) {
            throw new RuntimeException("Error executing API request", e);
        }
    }

}

