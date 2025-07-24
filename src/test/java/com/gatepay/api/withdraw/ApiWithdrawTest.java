package com.gatepay.api.withdraw;

import com.gatepay.api.withdraw.model.Withdraw;
import com.gatepay.api.withdraw.model.req.*;
import com.gatepay.common.GatePayConstants;
import com.gatepay.core.security.Credential;
import com.gatepay.core.GatePayConfig;
import com.gatepay.utils.RandomUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ApiWithdrawTest {

    private static ApiWithdraw apiWithdraw;

    @BeforeAll
    public static void init() {
        apiWithdraw = new ApiWithdraw(new GatePayConfig(GatePayConstants.END_POINT_DEFAULT, 30, "mZ96D37oKk-HrWJc", new Credential("Mz6M_q4AkDnZCSoTDo03A6OtWzN5ut8_Uix3jyVjxAU=", "SkZlbKOqPoMwnxhl")));
    }


    // todo test Parameter format is wrong or parameter transferring doesn't follow the rules
    @Test
    public void testCreateOrder() {
        Withdraw withdraw = new Withdraw();
        withdraw.setMerchant_withdraw_id(RandomUtils.generateNonce(19));
        withdraw.setCurrency("USDT");
        withdraw.setAmount("1");
        withdraw.setChain("ETH");
        withdraw.setAddress("0x1234567890abcdef");
        withdraw.setMemo("Payment for services-1");
        withdraw.setFee_type(1);
        CreateOrderReq createOrderReq = new CreateOrderReq();
        createOrderReq.setBatch_id(RandomUtils.generateNonce(18));
        createOrderReq.setWithdraw_list(new Withdraw[] { withdraw });
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

    // todo: test, host not found
    @Test
    public void testQueryStatus() {
        QueryStatusReq queryStatusReq = new QueryStatusReq();
        queryStatusReq.setCurrency("USDT");
        apiWithdraw.queryStatus(queryStatusReq);
    }

}
