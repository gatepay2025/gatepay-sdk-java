package com.gatepay.api.qrcode;

import com.gatepay.api.BaseApi;
import com.gatepay.api.qrcode.model.request.CreateOrderReq;
import com.gatepay.api.qrcode.model.response.CreateOrderResp;


/**
 * 二维码api
 *
 */
public class ApiQrCode extends BaseApi {

    /**
     * 创建扫码支付订单
     *
     */
    public CreateOrderResp createOrder(CreateOrderReq request) {
        return super.process(request, CreateOrderResp.class);
    }

}
