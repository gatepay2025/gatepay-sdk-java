/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.checkout;

import com.gatepay.core.api.BaseApi;
import com.gatepay.core.api.checkout.model.req.CreateOrderReq;
import com.gatepay.core.api.checkout.model.req.CreateRefundReq;
import com.gatepay.core.api.checkout.model.resp.CreateOrderResp;
import com.gatepay.core.api.checkout.model.resp.CreateRefundResp;
import com.gatepay.infrastructure.GatePayConfig;


/**
 * @Description 收银台支付接口
 * @author ZJ-BE
 * @Date 2025/07/25
 */
public class ApiCheckout extends BaseApi {

    public ApiCheckout(GatePayConfig gatePayConfig) {
        super(gatePayConfig);
    }


    /**
     * 创建收银台订单
     * @param request
     * @return
     */
    public CreateOrderResp createOrder(CreateOrderReq request) {
        return super.process(request, CreateOrderResp.class);
    }


    /**
     * 创建退款
     * @param request
     * @return
     */
    public CreateRefundResp createRefund(CreateRefundReq request) {
        return super.process(request, CreateRefundResp.class);
    }

}
