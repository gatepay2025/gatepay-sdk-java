package com.gatepay.core.api.payment;

import com.gatepay.core.api.payment.model.BatchOrder;
import com.gatepay.common.GatePayConstants;
import com.gatepay.common.model.req.EnvReq;
import com.gatepay.common.model.req.GoodsReq;
import com.gatepay.infrastructure.GatePayConfig;
import com.gatepay.infrastructure.security.Credential;
import com.gatepay.common.utils.RandomUtils;
import com.gatepay.core.api.payment.model.req.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class ApiPaymentTest {

    private static ApiPayment apiPayment;

    @BeforeAll
    public static void init() {
        apiPayment = new ApiPayment(new GatePayConfig(GatePayConstants.END_POINT_DEFAULT, 30, "mZ96D37oKk-HrWJc", new Credential("Mz6M_q4AkDnZCSoTDo03A6OtWzN5ut8_Uix3jyVjxAU=", "SkZlbKOqPoMwnxhl")));
    }


    // self test passed
    @Test
    public void testCreateOrder() {
        EnvReq envReq = new EnvReq();
        envReq.setTerminalType("MINIAPP");
        GoodsReq goodsReq = new GoodsReq();
        goodsReq.setGoodsName("25000000元宝");
        goodsReq.setGoodsDetail("充值");
        CreateOrderReq createOrderReq = new CreateOrderReq();
        createOrderReq.setMerchantTradeNo(RandomUtils.generateNonce(14));
        createOrderReq.setCurrency("USDT");
        createOrderReq.setOrderAmount("0.1");
        createOrderReq.setEnv(envReq);
        createOrderReq.setGoods(goodsReq);
        createOrderReq.setExtendInfo("1_elbt01_16882172126048");
        createOrderReq.setChannelId("123");
        apiPayment.createOrder(createOrderReq);
    }

    @Test
    public void testQueryOrder() {
        QueryOrderReq queryOrderReq = new QueryOrderReq();
        queryOrderReq.setMerchantTradeNo("1688217212j916");
        apiPayment.queryOrder(queryOrderReq);
    }

    @Test
    public void testCloseOrder() {
        CloseOrderReq closeOrderReq = new CloseOrderReq();
        closeOrderReq.setMerchantTradeNo("1688217212j916");
        apiPayment.closeOrder(closeOrderReq);
    }

    @Test
    public void testCreateRefund() {
        CreateRefundReq createRefundReq = new CreateRefundReq();
        createRefundReq.setRefundRequestId("4379824792349592517");
        createRefundReq.setPrepayId("188976582282448896");
        createRefundReq.setRefundAmount("0.9");
        apiPayment.createRefund(createRefundReq);
    }

    @Test
    public void testQueryRefund() {
        QueryRefundReq queryRefundReq = new QueryRefundReq();
        queryRefundReq.setRefundRequestId("156123911");
        apiPayment.queryRefund(queryRefundReq);
    }

    @Test
    public void testCreateBatchTransfer() {
        BatchOrder batchOrder = new BatchOrder();
        batchOrder.setUserId(6790011);
        batchOrder.setAmount("2");
        CreateBatchTransferReq createBatchTransferReq = new CreateBatchTransferReq();
        createBatchTransferReq.setBatchid(RandomUtils.generateNonce(14));
        createBatchTransferReq.setMerchantBatchNo(RandomUtils.generateNonce(24));
        createBatchTransferReq.setBizscene("REWARDS");
        createBatchTransferReq.setMerchantId("10002");
        createBatchTransferReq.setClientId("");
        createBatchTransferReq.setCurrency("USDT");
        createBatchTransferReq.setName("Larry");
        createBatchTransferReq.setDescription("bonus");
        createBatchTransferReq.setBatchorderList(new BatchOrder[]{ batchOrder });
        apiPayment.createBatchTransfer(createBatchTransferReq);
    }

    // self test passed
    @Test
    public void testQueryBatchTransfer() {
        QueryBatchTransferReq queryBatchTransferReq = new QueryBatchTransferReq();
        queryBatchTransferReq.setBatchId("93636743354388480");
        queryBatchTransferReq.setMerchantBatchNo("192392929193391");
        queryBatchTransferReq.setDetailStatus("ALL");
        apiPayment.queryBatchTransfer(queryBatchTransferReq);
    }

    // self test passed
    @Test
    public void testQueryBalance() {
        QueryBalanceReq queryBalanceReq = new QueryBalanceReq();
        apiPayment.queryBalance(queryBalanceReq);
    }

}
