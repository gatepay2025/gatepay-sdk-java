package com.gatepay.core.api.gift;

import com.gatepay.core.api.gift.model.req.CreateReq;
import com.gatepay.core.api.gift.model.req.ListTempReq;
import com.gatepay.core.api.gift.model.req.QueryReq;
import com.gatepay.common.GatePayConstants;
import com.gatepay.infrastructure.security.Credential;
import com.gatepay.infrastructure.GatePayConfig;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



public class ApiGiftTest {

    private static ApiGift apiGift;


    @BeforeAll
    public static void init() {
        apiGift = new ApiGift(new GatePayConfig(GatePayConstants.END_POINT_DEFAULT, 30, "mZ96D37oKk-HrWJc", new Credential("Mz6M_q4AkDnZCSoTDo03A6OtWzN5ut8_Uix3jyVjxAU=", "SkZlbKOqPoMwnxhl")));
    }

    @Test
    public void testCreate() {
        CreateReq request = new CreateReq();
        request.setTitle("anlitest20250210001");
        request.setTemplateId("293409440220057600");
        request.setCurrency("USDT");
        request.setAmount("0.99");
        apiGift.create(request);
    }

    @Test
    public void testListTemp() {
        ListTempReq listTempReq = new ListTempReq();
        apiGift.listTemp(listTempReq);
    }

    @Test
    public void testQuery() {
        QueryReq queryReq = new QueryReq();
        apiGift.query(queryReq);
    }

}
