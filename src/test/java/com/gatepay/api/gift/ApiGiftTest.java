package com.gatepay.api.gift;

import com.gatepay.api.gift.model.req.CreateReq;
import com.gatepay.api.gift.model.req.ListTempReq;
import com.gatepay.api.gift.model.req.QueryReq;
import com.gatepay.common.GatePayConstants;
import com.gatepay.core.security.Credential;
import com.gatepay.core.GatePayConfig;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



public class ApiGiftTest {

    private static ApiGift apiGift;


    @BeforeAll
    public static void init() {
        apiGift = new ApiGift(new GatePayConfig(GatePayConstants.END_POINT_DEFAULT, 30, "mZ96D37oKk-HrWJc", new Credential("Mz6M_q4AkDnZCSoTDo03A6OtWzN5ut8_Uix3jyVjxAU=", "SkZlbKOqPoMwnxhl")));
    }


    // todo: test, GIFT_TEMP_PERMISSION_ERROR
    @Test
    public void testCreate() {
        CreateReq request = new CreateReq();
        request.setTitle("anlitest20250210001");
        request.setTemplateId("293409440220057600");
        request.setCurrency("USDT");
        request.setAmount("0.99");
        apiGift.create(request);
    }

    // self test passed
    @Test
    public void testListTemp() {
        ListTempReq listTempReq = new ListTempReq();
        apiGift.listTemp(listTempReq);
    }

    // todo: test, GIFT_CARD_NOT_FOUND
    @Test
    public void testQuery() {
        QueryReq queryReq = new QueryReq();
        apiGift.query(queryReq);
    }

}
