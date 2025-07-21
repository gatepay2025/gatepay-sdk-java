package com.gatepay.api.web;

import com.gatepay.api.BaseApi;
import com.gatepay.api.web.model.request.*;
import com.gatepay.api.web.model.response.*;


public class ApiWeb extends BaseApi {

    private final String apiKey;




    public ApiWeb(String apiKey) {
        this.apiKey = apiKey;
    }


    /**
     * 创建订单
     */
    public CreateOrderResp createOrder(CreateOrderReq request) {
        return super.process(request, CreateOrderResp.class);
    }


    /**
     * 查询订单
     *
     * @param request
     */
    public QueryOrderResp queryOrder(QueryOrderReq request) {
        return super.process(request, QueryOrderResp.class);
    }


    /**
     * 关闭订单
     */
    public CloseOrderResp closeOrder(CloseOrderReq request) {
        return super.process(request, CloseOrderResp.class);
    }


    /**
     * 创建退款订单
     */
    public CreateRefundResp createRefund(CreateRefundReq request) {
        return super.process(request, CreateRefundResp.class);
    }


    /**
     * 查询退款订单
     */
    public QueryRefundResp queryRefund(QueryRefundReq request) {
        return super.process(request, QueryRefundResp.class);
    }


    /**
     * 创建批量转账
     */
    public CreateBatchTransferResp createBatchTransfer(CreateBatchTransferReq request) {
        return super.process(request, CreateBatchTransferResp.class);
    }


    /**
     * 查询批量转账
     */
    public QueryBatchTransferResp queryBatchTransfer(QueryBatchTransferReq request) {
        return super.process(request, QueryBatchTransferResp.class);
    }


    /**
     * 查询余额
     *
     * @param request
     * @return
     */
    public QueryBalanceResp queryBalance(QueryBalanceReq request) {
        return super.process(request, QueryBalanceResp.class);
    }

}
