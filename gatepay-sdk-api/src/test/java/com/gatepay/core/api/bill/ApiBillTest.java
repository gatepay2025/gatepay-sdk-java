package com.gatepay.core.api.bill;

import com.gatepay.core.api.bill.model.req.QueryOrdersReq;
import com.gatepay.common.GatePayConstants;
import com.gatepay.infrastructure.security.Credential;
import com.gatepay.infrastructure.GatePayConfig;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



public class ApiBillTest {

    private static ApiBill apiBill;


    @BeforeAll
    public static void init() {
        apiBill = new ApiBill(new GatePayConfig(GatePayConstants.END_POINT_DEFAULT, 30, "mZ96D37oKk-HrWJc", new Credential("Mz6M_q4AkDnZCSoTDo03A6OtWzN5ut8_Uix3jyVjxAU=", "SkZlbKOqPoMwnxhl")));
    }


    // seft test passed
    @Test
    public void testQueryOrders() {
        QueryOrdersReq queryOrdersReq = new QueryOrdersReq();
        queryOrdersReq.setStartTime(1705297715000L);
        queryOrdersReq.setEndTime(1705297825000L);
        queryOrdersReq.setPage(1);
        queryOrdersReq.setCount(10);
        queryOrdersReq.setCurrency("USDT");
        queryOrdersReq.setOrderType("1");
        queryOrdersReq.setOrderIdNo("1689667326891627");
        // queryOrdersReq.setFinancial_type("receipt_fi");
        apiBill.queryOrders(queryOrdersReq);
    }

}
