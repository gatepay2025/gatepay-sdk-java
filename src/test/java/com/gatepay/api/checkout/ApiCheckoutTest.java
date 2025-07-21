package com.gatepay.api.checkout;

import com.gatepay.common.model.EnvReq;
import com.gatepay.common.model.GoodsReq;
import com.gatepay.api.checkout.model.request.CreateOrderReq;
import com.gatepay.api.checkout.model.request.CreateRefundReq;
import org.junit.jupiter.api.Test;


public class ApiCheckoutTest {

    private ApiCheckout apiCheckout = new ApiCheckout();

    // self test passed
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
        request.setMerchantTradeNo("kt40t9i3t34kt0k09t543924");
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

    // todo: test
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
