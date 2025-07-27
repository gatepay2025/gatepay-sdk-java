/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.qrcode;

import com.gatepay.core.api.BaseApi;
import com.gatepay.core.api.qrcode.model.req.CreateOrderReq;
import com.gatepay.core.api.qrcode.model.resp.CreateOrderResp;
import com.gatepay.infrastructure.GatePayConfig;


/**
 * @Description 二维码api
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class ApiQrCode extends BaseApi {

    public ApiQrCode(GatePayConfig gatePayConfig) {
        super(gatePayConfig);
    }


    /**
     * 创建扫码支付订单
     * @param request
     * @return
     */
    public CreateOrderResp createOrder(CreateOrderReq request) {
        return super.process(request, CreateOrderResp.class);
    }

}
