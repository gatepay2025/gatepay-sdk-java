package com.gatepay.api.web;

import com.gatepay.api.web.model.BatchOrder;
import com.gatepay.api.web.model.request.*;
import com.gatepay.common.model.EnvReq;
import com.gatepay.common.model.GoodsReq;
import org.junit.jupiter.api.Test;


public class ApiWebTest {

    ApiWeb apiWeb = new ApiWeb("mZ96D37oKk-HrWJc");


    // self test passed
    @Test
    public void testCreateOrder() {
        EnvReq envReq = new EnvReq();
        envReq.setTerminalType("MINIAPP");
        GoodsReq goodsReq = new GoodsReq();
        goodsReq.setGoodsName("25000000元宝");
        goodsReq.setGoodsDetail("充值");
        CreateOrderReq createOrderReq = new CreateOrderReq();
        createOrderReq.setMerchantTradeNo("1688217212j916");
        createOrderReq.setCurrency("USDT");
        createOrderReq.setOrderAmount("0.1");
        createOrderReq.setEnv(envReq);
        createOrderReq.setGoods(goodsReq);
        createOrderReq.setExtendInfo("1_elbt01_16882172126048");
        createOrderReq.setChannelId("123");
        apiWeb.createOrder(createOrderReq);
    }

    // self test passed
    @Test
    public void testQueryOrder() {
        QueryOrderReq queryOrderReq = new QueryOrderReq();
        queryOrderReq.setMerchantTradeNo("1688217212j916");
        apiWeb.queryOrder(queryOrderReq);
    }

    // todo: test, GATEPAY_INVALID_ORDER_STATUS_EXPIRED
    @Test
    public void testCloseOrder() {
        CloseOrderReq closeOrderReq = new CloseOrderReq();
        closeOrderReq.setMerchantTradeNo("1688217212j916");
        apiWeb.closeOrder(closeOrderReq);
    }

    // todo: test ORDER_NOT_FOUND
    @Test
    public void testCreateRefund() {
        CreateRefundReq createRefundReq = new CreateRefundReq();
        createRefundReq.setRefundRequestId("4379824792349592517");
        createRefundReq.setPrepayId("188976582282448896");
        createRefundReq.setRefundAmount("0.9");
        apiWeb.createRefund(createRefundReq);
    }

    // todo: test, UNKNOWN_ERROR
    @Test
    public void testQueryRefund() {
        QueryRefundReq queryRefundReq = new QueryRefundReq();
        queryRefundReq.setRefundRequestId("156123911");
        apiWeb.queryRefund(queryRefundReq);
    }

    // todo: where is the api doc ?
    @Test
    public void testCreateBatchTransfer() {
        BatchOrder batchOrder = new BatchOrder();
        batchOrder.setUser_id(6790011);
        batchOrder.setAmount("2");
        CreateBatchTransferReq createBatchTransferReq = new CreateBatchTransferReq();
        createBatchTransferReq.setBatchid("13243243242445");
        createBatchTransferReq.setMerchant_batch_no("192392929193391");
        createBatchTransferReq.setBizscene("REWARDS");
        createBatchTransferReq.setMerchant_id("10002");
        createBatchTransferReq.setClient_id("");
        createBatchTransferReq.setCurrency("USDT");
        createBatchTransferReq.setName("Larry");
        createBatchTransferReq.setDescription("bonus");
        createBatchTransferReq.setBatchorderList(new BatchOrder[]{ batchOrder });
        apiWeb.createBatchTransfer(createBatchTransferReq);
    }

    // self test passed
    @Test
    public void testQueryBatchTransfer() {
        QueryBatchTransferReq queryBatchTransferReq = new QueryBatchTransferReq();
        queryBatchTransferReq.setBatch_id("93636743354388480");
        queryBatchTransferReq.setMerchant_batch_no("192392929193391");
        queryBatchTransferReq.setDetail_status("ALL");
        apiWeb.queryBatchTransfer(queryBatchTransferReq);
    }

    // self test passed
    @Test
    public void testQueryBalance() {
        QueryBalanceReq queryBalanceReq = new QueryBalanceReq();
        apiWeb.queryBalance(queryBalanceReq);
    }

}
