package com.gatepay.core.api.checkout;

import com.gatepay.common.GatePayConstants;
import com.gatepay.common.model.req.EnvReq;
import com.gatepay.common.model.req.GoodsReq;
import com.gatepay.core.api.checkout.model.req.CreateOrderReq;
import com.gatepay.core.api.checkout.model.req.CreateRefundReq;
import com.gatepay.infrastructure.security.Credential;
import com.gatepay.common.utils.RandomUtils;
import com.gatepay.infrastructure.GatePayConfig;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class ApiCheckoutTest {

    private static ApiCheckout apiCheckout;


    @BeforeAll
    public static void init() {
        apiCheckout = new ApiCheckout(new GatePayConfig(GatePayConstants.END_POINT_DEFAULT, 30, "mZ96D37oKk-HrWJc", new Credential("Mz6M_q4AkDnZCSoTDo03A6OtWzN5ut8_Uix3jyVjxAU=", "SkZlbKOqPoMwnxhl")));
    }

    @Test
    public void testCreateOrder() {
        EnvReq envReq = new EnvReq();
        envReq.setTerminalType("APP");
        GoodsReq goodsReq = new GoodsReq();
        goodsReq.setGoodsType("02");
        goodsReq.setGoodsName("Sipariş Ödemesi - 177");
        goodsReq.setGoodsDetail("Sipariş No : 160");
        CreateOrderReq request = new CreateOrderReq();
        request.setEnv(envReq);
        request.setGoods(goodsReq);
        request.setMerchantTradeNo(RandomUtils.generateNonce(24));
        request.setCurrency("USDT");
        request.setOrderAmount("0.9");
        request.setPayCurrency("USDT");
        request.setMerchantUserId(10002);
        request.setReturnUrl("https://lotkeys.com/tr/gate-payment-response");
        request.setCancelUrl("https://lotkeys.com/tr/gate-payment-response");
        request.setChain("ETH");
        request.setFullCurrType("USDT_ETH");
        request.setChannelId("123");
        apiCheckout.createOrder(request);
    }

    @Test
    public void testCreateRefund() {
        CreateRefundReq request = new CreateRefundReq();
        request.setRefundRequestId("100036668891340");
        request.setPrepayId("169501752302768128");
        request.setRefundOrderCurrency("USDT");
        request.setRefundOrderAmount("0.1");
        request.setRefundPayCurrency("USDT");
        request.setRefundPayAmount("0.1");
        request.setRefundReason("test refund");
        request.setReceiverId(6790011);
        apiCheckout.createRefund(request);
    }

}
