package com.gatepay.api.withdraw;

import com.gatepay.api.withdraw.model.Withdraw;
import com.gatepay.api.withdraw.model.request.*;
import org.junit.jupiter.api.Test;

public class ApiWithdrawTest {

    private ApiWithdraw apiWithdraw = new ApiWithdraw();


    // todo test Parameter format is wrong or parameter transferring doesn't follow the rules
    @Test
    public void testCreateOrder() {
        CreateOrderReq createOrderReq = new CreateOrderReq();
        createOrderReq.setBatch_id("237394559478075350");
        Withdraw withdraw = new Withdraw();
        withdraw.setMerchant_withdraw_id("M137394559478075550");
        withdraw.setCurrency("USDT");
        withdraw.setAmount("1");
        withdraw.setChain("ETH");
        withdraw.setAddress("0x1234567890abcdef");
        withdraw.setMemo("Payment for services-1");
        withdraw.setFee_type(1);
        apiWithdraw.createOrder(createOrderReq);
    }

    // self test passed
    @Test
    public void testQueryOrder() {
        QueryOrderReq queryOrderReq = new QueryOrderReq();
        queryOrderReq.setBatch_id("237394559478075555");
        queryOrderReq.setDetail_status("ALL");
        apiWithdraw.queryOrder(queryOrderReq);
    }

    // todo: test, INTERNAL_ERROR
    @Test
    public void testQueryChains() {
        QueryChainsReq queryChainsReq = new QueryChainsReq();
        queryChainsReq.setCurrency("GT");
        apiWithdraw.queryChains(queryChainsReq);
    }

    // todo: test, no data
    @Test
    public void testQueryBalance() {
        QueryBalanceReq queryChainsReq = new QueryBalanceReq();
        // queryChainsReq.setCurrency("USDT");
        apiWithdraw.queryBalance(queryChainsReq);
    }

    @Test
    public void testQueryStatus() {
        QueryStatusReq queryStatusReq = new QueryStatusReq();
        queryStatusReq.setCurrency("USDT");
        apiWithdraw.queryStatus(queryStatusReq);
    }

}
