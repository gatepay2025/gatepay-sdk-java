package com.gatepay.apis.checkout;

import com.gatepay.apis.BaseApi;
import com.gatepay.apis.checkout.model.request.CreateOrderReq;
import com.gatepay.apis.checkout.model.request.CreateRefundReq;
import com.gatepay.apis.checkout.model.response.CreateOrderResp;
import com.gatepay.apis.checkout.model.response.CreateRefundResp;


/**
 * 收银台支付接口
 *
 * @author ZJ-BE
 *
 */
public class ApiCheckout extends BaseApi {

    /**
     * 创建收银台订单
     *
     * @param request
     * @return
     */
    public CreateOrderResp createOrder(CreateOrderReq request) {
        try {
            return super.process(request, CreateOrderResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    /**
     * 创建退款
     *
     */
    public CreateRefundResp createRefund(CreateRefundReq request) {
        try {
            return super.process(request, CreateRefundResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
