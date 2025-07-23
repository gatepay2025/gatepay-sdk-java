package com.gatepay.api.payment;

import com.gatepay.api.BaseApi;
import com.gatepay.api.payment.model.req.OperateOrderReq;
import com.gatepay.api.payment.model.resp.QueryOrderResp;
import com.gatepay.core.GatePayConfig;


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

