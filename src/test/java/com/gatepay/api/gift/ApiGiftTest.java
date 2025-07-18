package com.gatepay.api.gift;

import com.gatepay.api.gift.model.ApiGift;
import com.gatepay.api.gift.model.request.CreateReq;
import org.junit.jupiter.api.Test;

public class ApiGiftTest {

    private ApiGift apiGift = new ApiGift();


    @Test
    public void testCreate() {
        CreateReq request = new CreateReq();
        request.setTitle("anlitest20250210001");
        request.setTemplateId("293409440220057600");
        request.setCurrency("USDT");
        request.setAmount("0.99");
        apiGift.create(request);
    }

}
