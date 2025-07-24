package com.gatepay.api.address;

import com.gatepay.common.GatePayConstants;
import com.gatepay.common.model.req.EnvReq;
import com.gatepay.common.model.req.GoodsReq;
import com.gatepay.core.security.Credential;
import com.gatepay.core.GatePayConfig;
import com.gatepay.utils.RandomUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Date;


public class ApiAddressTest {

    private static ApiAddress apiAddress;

    @BeforeAll
    public static void init() {
        apiAddress = new ApiAddress(new GatePayConfig(GatePayConstants.END_POINT_DEFAULT, 30, "mZ96D37oKk-HrWJc", new Credential("Mz6M_q4AkDnZCSoTDo03A6OtWzN5ut8_Uix3jyVjxAU=", "SkZlbKOqPoMwnxhl")));
    }



    // self test passed
    @Test
    public void testGetAddressChains() {
        ChainsReq chainsReq = new ChainsReq();
        chainsReq.setCurrency("USDT");
        apiAddress.getAddressChains(chainsReq);
    }

    // self test passed
    @Test
    public void testGetAddressCurrencies() {
        apiAddress.getAddressCurrencies();
    }

    // self test passed
    @Test
    public void testGetSupportedConvertCurrencies() {
        SupportedConvertCurrenciesReq supportedConvertCurrenciesReq = new SupportedConvertCurrenciesReq();
        supportedConvertCurrenciesReq.setCurrency("USDT");
        apiAddress.getSupportedConvertCurrencies(supportedConvertCurrenciesReq);
    }

    // self test passed
    @Test
    public void testCreateOrder() {
        EnvReq envReq = new EnvReq();
        envReq.setTerminalType("MINIAPP");
        GoodsReq goodsReq = new GoodsReq();
        goodsReq.setGoodsName("测试商品");
        goodsReq.setGoodsDetail("测试商品详情");
        CreateOrderReq createOrderReq = new CreateOrderReq();
        createOrderReq.setMerchantTradeNo(RandomUtils.generateNonce(24));
        createOrderReq.setCurrency("USDT");
        createOrderReq.setOrderAmount("9.9");
        createOrderReq.setEnv(envReq);
        createOrderReq.setGoods(goodsReq);
        createOrderReq.setOrderExpireTime(new Date().getTime() + 3 * 60 * 60 * 1000);
        createOrderReq.setReturnUrl("https://www.gate.com/");
        createOrderReq.setCancelUrl("https://www.gate.com/");
        createOrderReq.setMerchantUserId(6790011);
        createOrderReq.setChain("ETH");
        createOrderReq.setFullCurrType("USDT_ETH");
        createOrderReq.setChannelId("");
        try {
            apiAddress.createOrder(createOrderReq);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // self test passed
    @Test
    public void testQueryOrder() {
        QueryOrderReq queryOrderReq = new QueryOrderReq();
        queryOrderReq.setPrepayId("335379804967424000");
        queryOrderReq.setMerchantTradeNo("7572363776");
        apiAddress.queryOrder(queryOrderReq);
    }


    // todo: test
    @Test
    public void testCreateRefund() {
        CreateRefundReq createRefundReq = new CreateRefundReq();
        createRefundReq.setRefundRequestId("342376781523689472");
        createRefundReq.setPrepayId("189325939234050048");
        createRefundReq.setRefundAmount("19.8");
        createRefundReq.setRefundReason("test refund");
        createRefundReq.setReceiverId(6790011);
        try {
            apiAddress.createRefund(createRefundReq);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // todo: test
    @Test
    public void testCreateRefundConvert() {
        CreateRefundConvertReq createRefundConvertReq = new CreateRefundConvertReq();
        createRefundConvertReq.setRefundRequestId("93840202999210221");
        createRefundConvertReq.setPrepayId("189388469725827072");
        createRefundConvertReq.setRefundOrderCurrency("ETH");
        createRefundConvertReq.setRefundOrderAmount("1");
        createRefundConvertReq.setRefundPayCurrency("USDT");
        createRefundConvertReq.setRefundPayAmount("1.02");
        createRefundConvertReq.setRefundReason("refund test");
        createRefundConvertReq.setReceiverId(6790011);
        try {
            apiAddress.createRefundConvert(createRefundConvertReq);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // self test passed
    @Test
    public void testTransactionDetail() {
        TransactionDetailReq transactionDetailReq = new TransactionDetailReq();
        transactionDetailReq.setPrepayId("132157692839989248");
        try {
            apiAddress.transactionDetail(transactionDetailReq);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
