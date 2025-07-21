package com.gatepay.api.gift;

import com.gatepay.api.gift.model.request.CreateReq;
import com.gatepay.api.gift.model.request.ListTempReq;
import com.gatepay.api.gift.model.request.QueryReq;
import org.junit.jupiter.api.Test;

public class ApiGiftTest {

    private ApiGift apiGift = new ApiGift();


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
