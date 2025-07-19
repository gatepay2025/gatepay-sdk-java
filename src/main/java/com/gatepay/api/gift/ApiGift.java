package com.gatepay.api.gift;

import com.gatepay.api.BaseApi;
import com.gatepay.api.gift.model.request.CreateReq;
import com.gatepay.api.gift.model.request.ListTempReq;
import com.gatepay.api.gift.model.request.QueryReq;
import com.gatepay.api.gift.model.response.CreateResp;
import com.gatepay.api.gift.model.response.ListTempResp;
import com.gatepay.api.gift.model.response.QueryResp;

public class ApiGift extends BaseApi {

    public CreateResp create(CreateReq request) {
        try {
            return super.process(request, CreateResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public ListTempResp listTemp(ListTempReq request) {
        try {
            return super.process(request, ListTempResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public QueryResp query(QueryReq request) {
        try {
            return super.process(request, QueryResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
