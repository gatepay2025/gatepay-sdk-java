package com.gatepay.core.api.qrcode;

import com.gatepay.core.api.BaseApi;
import com.gatepay.core.api.qrcode.model.req.CreateOrderReq;
import com.gatepay.core.api.qrcode.model.resp.CreateOrderResp;
import com.gatepay.common.GatePayConfig;


/**
 * 二维码api
 *
 */
public class ApiQrCode extends BaseApi {

    public ApiQrCode(GatePayConfig gatePayConfig) {
        super(gatePayConfig);
    }


    /**
     * 创建扫码支付订单
     *
     */
    public CreateOrderResp createOrder(CreateOrderReq request) {
        return super.process(request, CreateOrderResp.class);
    }

}
