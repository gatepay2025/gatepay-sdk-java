package com.gatepay.api.qrcode;

import com.gatepay.api.BaseApi;
import com.gatepay.api.qrcode.model.request.CreateOrderReq;
import com.gatepay.api.qrcode.model.response.CreateOrderResp;


public class ApiQrCode extends BaseApi {

    /**
     * 创建扫码支付订单
     *
     */
    public CreateOrderResp createOrder(CreateOrderReq request) {
        try {
            super.process(request, CreateOrderResp.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
