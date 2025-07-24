package com.gatepay.core.api.gift;

import com.gatepay.core.api.BaseApi;
import com.gatepay.core.api.gift.model.req.CreateReq;
import com.gatepay.core.api.gift.model.req.ListTempReq;
import com.gatepay.core.api.gift.model.req.QueryReq;
import com.gatepay.core.api.gift.model.resp.CreateResp;
import com.gatepay.core.api.gift.model.resp.ListTempResp;
import com.gatepay.core.api.gift.model.resp.QueryResp;
import com.gatepay.common.GatePayConfig;


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
