package com.gatepay.api.bill;

import com.gatepay.api.bill.model.request.QueryOrdersReq;
import org.junit.jupiter.api.Test;

public class ApiBillTest {

    private ApiBill apiBill = new ApiBill();


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
