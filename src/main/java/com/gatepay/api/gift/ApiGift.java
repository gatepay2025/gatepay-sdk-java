package com.gatepay.api.gift;

import com.gatepay.api.BaseApi;
import com.gatepay.api.gift.model.req.CreateReq;
import com.gatepay.api.gift.model.req.ListTempReq;
import com.gatepay.api.gift.model.req.QueryReq;
import com.gatepay.api.gift.model.resp.CreateResp;
import com.gatepay.api.gift.model.resp.ListTempResp;
import com.gatepay.api.gift.model.resp.QueryResp;
import com.gatepay.core.GatePayConfig;


/**
 * 礼品卡
 *
 */
public class ApiGift extends BaseApi {

    public ApiGift(GatePayConfig gatePayConfig) {
        super(gatePayConfig);
    }


    /**
     * 创建礼品卡
     */
    public CreateResp create(CreateReq request) {
        return super.process(request, CreateResp.class);
    }

    /**
     * 列出礼品卡模板
     */
    public ListTempResp listTemp(ListTempReq request) {
        return super.process(request, ListTempResp.class);
    }

    /**
     * 查询礼品卡
     */
    public QueryResp query(QueryReq request) {
        return super.process(request, QueryResp.class);
    }

}
