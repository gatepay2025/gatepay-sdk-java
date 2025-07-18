package com.gatepay.api.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gatepay.api.BaseApi;
import com.gatepay.api.web.model.request.*;
import com.gatepay.api.web.model.response.*;


public class ApiWeb extends BaseApi {

    private final String apiKey;
    private final ObjectMapper objectMapper;




    public ApiWeb(String apiKey) {
        this.apiKey = apiKey;
        this.objectMapper = new ObjectMapper();
    }


    /**
     * 创建订单
     */
    public CreateOrderResp createOrder(CreateOrderReq request) {
        try {
            return super.process(request, CreateOrderResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    /**
     * 查询订单
     *
     * @param request
     */
    public QueryOrderResp queryOrder(QueryOrderReq request) {
        try {
            return super.process(request, QueryOrderResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    /**
     * 关闭订单
     */
    public CloseOrderResp closeOrder(CloseOrderReq request) {
        try {
            return super.process(request, CloseOrderResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    /**
     * 创建退款订单
     */
    public CreateRefundResp createRefund(CreateRefundReq request) {
        try {
            return super.process(request, CreateRefundResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    /**
     * 查询退款订单
     */
    public QueryRefundResp queryRefund(QueryRefundReq request) {
        try {
            return super.process(request, QueryRefundResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    /**
     * 创建批量转账
     */
    public CreateBatchTransferResp createBatchTransfer(CreateBatchTransferReq request) {
        try {
            return super.process(request, CreateBatchTransferResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    /**
     * 查询批量转账
     */
    public QueryBatchTransferResp queryBatchTransfer(QueryBatchTransferReq request) {
        try {
            return super.process(request, QueryBatchTransferResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    /**
     * 查询余额
     *
     * @param request
     * @return
     */
    public QueryBalanceResp queryBalance(QueryBalanceReq request) {
        try {
            return super.process(request, QueryBalanceResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
