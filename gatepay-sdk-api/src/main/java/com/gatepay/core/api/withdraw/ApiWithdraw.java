/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.withdraw;

import com.gatepay.core.api.BaseApi;
import com.gatepay.core.api.withdraw.model.req.*;
import com.gatepay.core.api.withdraw.model.resp.*;
import com.gatepay.infrastructure.GatePayConfig;

/**
 * @Description 下发api
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class ApiWithdraw extends BaseApi {

    public ApiWithdraw(GatePayConfig gatePayConfig) {
        super(gatePayConfig);
    }


    /**
     * 创建提现订单
     * @param request
     * @return
     */
    public CreateOrderResp createOrder(CreateOrderReq request) {
        return super.process(request, CreateOrderResp.class);
    }


    /**
     * 查询提现订单
     *
     * detail_status:
     * ALL 全部子订单
     * PENDING 待处理子订单
     * PROCESSING 已提交提现请求，待确认子订单
     * CHECK 审核中子订单
     * FAIL 失败子订单
     * DONE 提现成功子订单
     *
     * @param request
     * @return
     */
    public QueryOrderResp queryOrder(QueryOrderReq request) {
        return super.process(request, QueryOrderResp.class);
    }


    /**
     * 查询币种支持的链
     * @param request
     * @return
     */
    public QueryChainsResp queryChains(QueryChainsReq request) {
        return super.process(request, QueryChainsResp.class);
    }


    /**
     * 查询个人账户余额
     * @param request
     * @return
     */
    public QueryBalanceResp queryBalance(QueryBalanceReq request) {
        return super.process(request, QueryBalanceResp.class);
    }


    /**
     * 查询提现状态
     * @param request
     * @return
     */
    public QueryStatusResp queryStatus(QueryStatusReq request) {
        return super.process(request, QueryStatusResp.class);
    }

}
