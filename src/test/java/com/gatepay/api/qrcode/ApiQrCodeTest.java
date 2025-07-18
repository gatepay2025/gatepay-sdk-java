package com.gatepay.api.qrcode;

import com.gatepay.api.qrcode.model.request.CreateOrderReq;
import com.gatepay.common.model.EnvReq;
import com.gatepay.common.model.GoodsReq;
import org.junit.jupiter.api.Test;

public class ApiQrCodeTest {

    private ApiQrCode apiQrCode = new ApiQrCode();


    @Test
    public void testCreateOrder() {
        EnvReq envReq = new EnvReq();
        envReq.setTerminalType("APP");
        GoodsReq goodsReq = new GoodsReq();
        goodsReq.setGoodsName("NF2T");
        goodsReq.setGoodsDetail("nef-book");
        CreateOrderReq createOrderReq = new CreateOrderReq();
        createOrderReq.setMerchantTradeNo("040583084092304592");
        createOrderReq.setCurrency("USDT");
        createOrderReq.setOrderAmount("0.9");
        createOrderReq.setEnv(envReq);
        createOrderReq.setGoods(goodsReq);
        createOrderReq.setReturnUrl("http://www.baidu.com");
        apiQrCode.createOrder(createOrderReq);
    }

}
