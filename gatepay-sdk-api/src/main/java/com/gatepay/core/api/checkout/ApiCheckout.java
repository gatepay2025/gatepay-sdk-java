package com.gatepay.core.api.checkout;

import com.gatepay.core.api.BaseApi;
import com.gatepay.core.api.checkout.model.req.CreateOrderReq;
import com.gatepay.core.api.checkout.model.req.CreateRefundReq;
import com.gatepay.core.api.checkout.model.resp.CreateOrderResp;
import com.gatepay.core.api.checkout.model.resp.CreateRefundResp;
import com.gatepay.common.GatePayConfig;


/**
 * 收银台支付接口
 *
 * @author ZJ-BE
 *
 */
public class ApiCheckout extends BaseApi {

    public ApiCheckout(GatePayConfig gatePayConfig) {
        super(gatePayConfig);
    }


    /**
     * 创建收银台订单
     *
     * @param request
     * @return
     */
    public CreateOrderResp createOrder(CreateOrderReq request) {
        return super.process(request, CreateOrderResp.class);
    }


    /**
     * 创建退款
     *
     * @param request
     *
     */
    public CreateRefundResp createRefund(CreateRefundReq request) {
        return super.process(request, CreateRefundResp.class);
    }

}
