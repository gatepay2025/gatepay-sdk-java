package com.gatepay.core.api.convert;

import com.gatepay.core.api.BaseApi;
import com.gatepay.core.api.convert.model.req.*;
import com.gatepay.core.api.convert.model.resp.*;
import com.gatepay.common.GatePayConfig;


/**
 * 闪兑接口
 *
 */
public class ApiConvert extends BaseApi {

    public ApiConvert(GatePayConfig gatePayConfig) {
        super(gatePayConfig);
    }


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
    public CreateOrderResp createOrder(CreateOrderReq request) {
        return super.process(request, CreateOrderResp.class);
    }

    /**
     * 查询闪兑订单
     *
     * @param request
     *
     */
    public QueryOrderResp queryOrder(QueryOrderReq request) {
        return super.process(request, QueryOrderResp.class);
    }

}
