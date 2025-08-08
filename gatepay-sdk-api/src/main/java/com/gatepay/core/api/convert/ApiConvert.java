/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.convert;

import com.gatepay.core.api.BaseApi;
import com.gatepay.core.api.convert.model.req.*;
import com.gatepay.core.api.convert.model.resp.*;
import com.gatepay.infrastructure.GatePayConfig;


/**
 * @Description 闪兑接口
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class ApiConvert extends BaseApi {

    public ApiConvert(GatePayConfig gatePayConfig) {
        super(gatePayConfig);
    }


    /**
     * 查询可用闪兑币种
     * @param request
     * @return
     */
    public QueryCurrencyResp queryCurrency(QueryCurrencyReq request) {
        return super.process(request, QueryCurrencyResp.class);
    }

    /**
     * 查询可用币种对
     * @param request
     * @return
     */
    public QueryPairResp queryPair(QueryPairReq request) {
        return super.process(request, QueryPairResp.class);
    }

    /**
     * 预览报价
     * @param request
     * @return
     */
    public PreviewResp preview(PreviewReq request) {
        return super.process(request, PreviewResp.class);
    }

    /**
     * 闪兑下单
     * @param request
     * @return
     */
    public CreateOrderResp createOrder(CreateOrderReq request) {
        return super.process(request, CreateOrderResp.class);
    }

    /**
     * 查询闪兑订单
     * @param request
     * @return
     */
    public QueryOrderResp queryOrder(QueryOrderReq request) {
        return super.process(request, QueryOrderResp.class);
    }

}
