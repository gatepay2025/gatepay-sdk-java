package com.gatepay.api.checkout;

import com.gatepay.api.BaseApi;
import com.gatepay.api.checkout.model.request.CreateOrderReq;
import com.gatepay.api.checkout.model.request.CreateRefundReq;
import com.gatepay.api.checkout.model.response.CreateOrderResp;
import com.gatepay.api.checkout.model.response.CreateRefundResp;
import com.gatepay.core.GatePayConfig;


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
