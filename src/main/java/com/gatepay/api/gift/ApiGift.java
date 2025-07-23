package com.gatepay.api.gift;

import com.gatepay.api.BaseApi;
import com.gatepay.api.gift.model.request.CreateReq;
import com.gatepay.api.gift.model.request.ListTempReq;
import com.gatepay.api.gift.model.request.QueryReq;
import com.gatepay.api.gift.model.response.CreateResp;
import com.gatepay.api.gift.model.response.ListTempResp;
import com.gatepay.api.gift.model.response.QueryResp;
import com.gatepay.core.GatePayConfig;


/**
 * 礼品卡
 *
 */
public class ApiGift extends BaseApi {

    public ApiGift(GatePayConfig gatePayConfig) {
        super(gatePayConfig);
    }


    public CreateResp create(CreateReq request) {
        return super.process(request, CreateResp.class);
    }

    public ListTempResp listTemp(ListTempReq request) {
        return super.process(request, ListTempResp.class);
    }

    public QueryResp query(QueryReq request) {
        return super.process(request, QueryResp.class);
    }

}
