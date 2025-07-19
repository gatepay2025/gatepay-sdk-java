package com.gatepay.api.convert;

import com.gatepay.api.BaseApi;
import com.gatepay.api.convert.model.request.CreateOrderReq;
import com.gatepay.api.convert.model.request.PreviewReq;
import com.gatepay.api.convert.model.request.QueryCurrencyReq;
import com.gatepay.api.convert.model.request.QueryPairReq;
import com.gatepay.api.convert.model.response.CreateOrderResp;
import com.gatepay.api.convert.model.response.PreviewResp;
import com.gatepay.api.convert.model.response.QueryCurrencyResp;
import com.gatepay.api.convert.model.response.QueryPairResp;


/**
 * 闪兑接口
 *
 */
public class ApiConvert extends BaseApi {

    /**
     * 查询可用闪兑币种
     *
     * @param request
     * @return
     */
    public QueryCurrencyResp queryCurrency(QueryCurrencyReq request) {
        return super.process(request, QueryCurrencyResp.class);
    }

    /**
     * 查询可用币种对
     *
     */
    public QueryPairResp queryPair(QueryPairReq request) {
        return super.process(request, QueryPairResp.class);
    }

    /**
     * 预览报价
     *
     */
    public PreviewResp preview(PreviewReq request) {
        return super.process(request, PreviewResp.class);
    }

    /**
     * 闪兑下单
     *
     */
    public CreateOrderResp convert(CreateOrderReq request) {
        return super.process(request, CreateOrderResp.class);
    }

}
