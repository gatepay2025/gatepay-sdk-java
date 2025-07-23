package com.gatepay.api.qrcode;

import com.gatepay.api.qrcode.model.request.CreateOrderReq;
import com.gatepay.common.GatePayConstants;
import com.gatepay.common.model.req.EnvReq;
import com.gatepay.common.model.req.GoodsReq;
import com.gatepay.core.Credential;
import com.gatepay.core.GatePayConfig;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class ApiQrCodeTest {

    private static ApiQrCode apiQrCode;

    @BeforeAll
    public static void init() {
        apiQrCode = new ApiQrCode(new GatePayConfig(GatePayConstants.END_POINT_DEFAULT, 30, "mZ96D37oKk-HrWJc", new Credential("Mz6M_q4AkDnZCSoTDo03A6OtWzN5ut8_Uix3jyVjxAU=", "SkZlbKOqPoMwnxhl")));
    }


    // self test passed
    @Test
    public void testCreateOrder() {
        EnvReq envReq = new EnvReq();
        envReq.setTerminalType("APP");
        GoodsReq goodsReq = new GoodsReq();
        goodsReq.setGoodsName("NF2T");
        goodsReq.setGoodsDetail("nef-book");
        CreateOrderReq createOrderReq = new CreateOrderReq();
        createOrderReq.setMerchantTradeNo("040583084092304594");
        createOrderReq.setCurrency("USDT");
        createOrderReq.setOrderAmount("0.9");
        createOrderReq.setEnv(envReq);
        createOrderReq.setGoods(goodsReq);
        createOrderReq.setReturnUrl("http://www.baidu.com");
        apiQrCode.createOrder(createOrderReq);
    }

}
