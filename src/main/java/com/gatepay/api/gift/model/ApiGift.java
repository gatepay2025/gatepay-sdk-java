package com.gatepay.api.gift.model;

import com.gatepay.api.BaseApi;
import com.gatepay.api.gift.model.request.CreateReq;
import com.gatepay.api.gift.model.response.CreateResp;

public class ApiGift extends BaseApi {

    public CreateResp create(CreateReq request) {
        try {
            return super.process(request, CreateResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
