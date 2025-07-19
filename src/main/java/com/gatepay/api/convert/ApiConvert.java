package com.gatepay.api.convert;

import com.gatepay.api.BaseApi;
import com.gatepay.api.convert.model.request.QueryCurrencyReq;
import com.gatepay.api.convert.model.request.QueryPairReq;
import com.gatepay.api.convert.model.response.QueryCurrencyResp;
import com.gatepay.api.convert.model.response.QueryPairResp;


public class ApiConvert extends BaseApi {

    /**
     * 查询可用闪兑币种
     *
     * @param request
     * @return
     */
    public QueryCurrencyResp queryCurrency(QueryCurrencyReq request) {
        try {
            return super.process(request, QueryCurrencyResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * 查询可用币种对
     *
     */
    public QueryPairResp queryPair(QueryPairReq request) {
        try {
            return super.process(request, QueryPairResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
