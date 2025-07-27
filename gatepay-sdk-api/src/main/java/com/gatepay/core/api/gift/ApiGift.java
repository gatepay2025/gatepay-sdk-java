/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.gift;

import com.gatepay.core.api.BaseApi;
import com.gatepay.core.api.gift.model.req.CreateReq;
import com.gatepay.core.api.gift.model.req.ListTempReq;
import com.gatepay.core.api.gift.model.req.QueryReq;
import com.gatepay.core.api.gift.model.resp.CreateResp;
import com.gatepay.core.api.gift.model.resp.ListTempResp;
import com.gatepay.core.api.gift.model.resp.QueryResp;
import com.gatepay.infrastructure.GatePayConfig;


/**
 * @Description 礼品卡
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class ApiGift extends BaseApi {

    public ApiGift(GatePayConfig gatePayConfig) {
        super(gatePayConfig);
    }


    /**
     * 创建礼品卡
     * @param request
     * @return
     */
    public CreateResp create(CreateReq request) {
        return super.process(request, CreateResp.class);
    }

    /**
     * 列出礼品卡模板
     * @param request
     * @return
     */
    public ListTempResp listTemp(ListTempReq request) {
        return super.process(request, ListTempResp.class);
    }

    /**
     * 查询礼品卡
     * @param request
     * @return
     */
    public QueryResp query(QueryReq request) {
        return super.process(request, QueryResp.class);
    }

}
