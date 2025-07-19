package com.gatepay.api.web;

import com.gatepay.api.web.model.BatchOrder;
import com.gatepay.api.web.model.request.*;
import org.junit.jupiter.api.Test;


public class ApiWebTest {

    ApiWeb apiWeb = new ApiWeb("mZ96D37oKk-HrWJc");


    @Test
    public void testCreateOrder() {
        CreateOrderReq createOrderReq = new CreateOrderReq();
        apiWeb.createOrder(createOrderReq);
    }

    @Test
    public void testQueryOrder() {
        QueryOrderReq queryOrderReq = new QueryOrderReq();
        apiWeb.queryOrder(queryOrderReq);
    }

    @Test
    public void testCloseOrder() {
        CloseOrderReq closeOrderReq = new CloseOrderReq();
        apiWeb.closeOrder(closeOrderReq);
    }

    @Test
    public void testCreateRefund() {
        CreateRefundReq createRefundReq = new CreateRefundReq();
        createRefundReq.setRefundRequestId("4379824792349592517");
        createRefundReq.setPrepayId("188976582282448896");
        createRefundReq.setRefundAmount("0.9");
        apiWeb.createRefund(createRefundReq);
    }

    @Test
    public void testQueryRefund() {
        QueryRefundReq queryRefundReq = new QueryRefundReq();
        queryRefundReq.setRefundRequestId("483902480932840785");
        apiWeb.queryRefund(queryRefundReq);
    }

    @Test
    public void testCreateBatchTransfer() {
        BatchOrder batchOrder = new BatchOrder();
        batchOrder.setUser_id(6790011);
        batchOrder.setAmount("2");
        CreateBatchTransferReq createBatchTransferReq = new CreateBatchTransferReq();
        createBatchTransferReq.setBatchid("13243243242444");
        createBatchTransferReq.setMerchant_batch_no("192392929193500");
        createBatchTransferReq.setBizscene("REWARDS");
        createBatchTransferReq.setMerchant_id("10002");
        createBatchTransferReq.setClient_id("");
        createBatchTransferReq.setCurrency("USDT");
        createBatchTransferReq.setName("Larry");
        createBatchTransferReq.setDescription("bonus");
        createBatchTransferReq.setBatchorderList(new BatchOrder[]{ batchOrder });
        apiWeb.createBatchTransfer(createBatchTransferReq);
    }

    @Test
    public void testQueryBatchTransfer() {
        QueryBatchTransferReq queryBatchTransferReq = new QueryBatchTransferReq();
        queryBatchTransferReq.setBatch_id("93636743354388480");
        queryBatchTransferReq.setMerchant_batch_no("192392929193391");
        queryBatchTransferReq.setDetail_status("ALL");
        apiWeb.queryBatchTransfer(queryBatchTransferReq);
    }

    @Test
    public void testQueryBalance() {
        QueryBalanceReq queryBalanceReq = new QueryBalanceReq();
        apiWeb.queryBalance(queryBalanceReq);
    }

}
