package com.gatepay.core.api.withdraw;

import com.gatepay.core.api.withdraw.model.Withdraw;
import com.gatepay.common.GatePayConstants;
import com.gatepay.common.security.Credential;
import com.gatepay.common.GatePayConfig;
import com.gatepay.common.utils.RandomUtils;
import com.gatepay.core.api.withdraw.model.req.*;
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
        withdraw.setMerchantWithdrawId(RandomUtils.generateNonce(19));
        withdraw.setCurrency("USDT");
        withdraw.setAmount("1");
        withdraw.setChain("ETH");
        withdraw.setAddress("0x1234567890abcdef");
        withdraw.setMemo("Payment for services-1");
        withdraw.setFeeType(1);
        CreateOrderReq createOrderReq = new CreateOrderReq();
        createOrderReq.setBatchId(RandomUtils.generateNonce(18));
        createOrderReq.setWithdraws(new Withdraw[] { withdraw });
        apiWithdraw.createOrder(createOrderReq);
    }

    // self test passed
    @Test
    public void testQueryOrder() {
        QueryOrderReq queryOrderReq = new QueryOrderReq();
        queryOrderReq.setBatchId("237394559478075555");
        queryOrderReq.setDetailStatus("ALL");
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
        new ApiWithdraw(new GatePayConfig(GatePayConstants.END_POINT_OPEN_PLATFORM, 30, "mZ96D37oKk-HrWJc", new Credential("Mz6M_q4AkDnZCSoTDo03A6OtWzN5ut8_Uix3jyVjxAU=", "SkZlbKOqPoMwnxhl")))
                .queryStatus(queryStatusReq);
    }

}
