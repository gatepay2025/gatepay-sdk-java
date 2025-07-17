package com.gatepay.service.checkout.model;

import com.gatepay.service.BaseApi;
import com.gatepay.service.checkout.model.request.CreateOrderReq;
import com.gatepay.service.checkout.model.response.CreateOrderResp;

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



}
