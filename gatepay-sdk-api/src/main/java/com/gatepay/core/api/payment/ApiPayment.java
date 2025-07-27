/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.payment;

import com.gatepay.core.api.BaseApi;
import com.gatepay.core.api.payment.model.req.*;
import com.gatepay.core.api.payment.model.resp.*;
import com.gatepay.infrastructure.GatePayConfig;

/**
 * @Description 普通支付api
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class ApiPayment extends BaseApi {

    public ApiPayment(GatePayConfig gatePayConfig) {
        super(gatePayConfig);
    }


    /**
     * 创建订单
     * @param request
     * @return
     */
    public CreateOrderResp createOrder(CreateOrderReq request) {
        return super.process(request, CreateOrderResp.class);
    }


    /**
     * 查询订单
     * @param request
     * @return
     */
    public QueryOrderResp queryOrder(QueryOrderReq request) {
        return super.process(request, QueryOrderResp.class);
    }


    /**
     * 关闭订单
     * @param request
     * @return
     */
    public CloseOrderResp closeOrder(CloseOrderReq request) {
        return super.process(request, CloseOrderResp.class);
    }


    /**
     * 创建退款订单
     * @param request
     * @return
     */
    public CreateRefundResp createRefund(CreateRefundReq request) {
        return super.process(request, CreateRefundResp.class);
    }


    /**
     * 查询退款订单
     * @param request
     * @return
     */
    public QueryRefundResp queryRefund(QueryRefundReq request) {
        return super.process(request, QueryRefundResp.class);
    }


    /**
     * 创建批量转账
     * @param request
     * @return
     */
    public CreateBatchTransferResp createBatchTransfer(CreateBatchTransferReq request) {
        return super.process(request, CreateBatchTransferResp.class);
    }


    /**
     * 查询批量转账
     * @param request
     * @return
     */
    public QueryBatchTransferResp queryBatchTransfer(QueryBatchTransferReq request) {
        return super.process(request, QueryBatchTransferResp.class);
    }


    /**
     * 查询余额
     * @param request
     * @return
     */
    public QueryBalanceResp queryBalance(QueryBalanceReq request) {
        return super.process(request, QueryBalanceResp.class);
    }

}
