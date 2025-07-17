package com.gatepay.service.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gatepay.core.Client;
import com.gatepay.core.signature.Nonce;
import com.gatepay.service.web.model.request.*;
import com.gatepay.service.web.model.response.*;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ApiWeb {

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
            HttpRequest httpRequest = Client.generateHttpRequest(request, System.currentTimeMillis(), Nonce.generateNonce(9));
            HttpResponse<String> response = Client.generateHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new CreateOrderResp();
    }


    /**
     * 查询订单
     *
     * @param request
     */
    public QueryOrderResp queryOrder(QueryOrderReq request) throws JsonProcessingException {
        try {
            HttpRequest httpRequest = Client.generateHttpRequest(request, System.currentTimeMillis(), Nonce.generateNonce(9));
            HttpResponse<String> response = Client.generateHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new QueryOrderResp();
    }


    /**
     * 关闭订单
     */
    public CloseOrderResp closeOrder(CloseOrderReq request) {
        try {
            HttpRequest httpRequest = Client.generateHttpRequest(request, System.currentTimeMillis(), Nonce.generateNonce(9));
            HttpResponse<String> response = Client.generateHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new CloseOrderResp();
    }


    /**
     * 创建退款订单
     */
    public CreateRefundResp createRefund(CreateRefundReq request) {
        try {
            HttpRequest httpRequest = Client.generateHttpRequest(request, System.currentTimeMillis(), Nonce.generateNonce(9));
            HttpResponse<String> response = Client.generateHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new CreateRefundResp();
    }


    /**
     * 查询退款订单
     */
    public QueryRefundResp queryRefund(QueryRefundReq request) {
        try {
            HttpRequest httpRequest = Client.generateHttpRequest(request, System.currentTimeMillis(), Nonce.generateNonce(9));
            HttpResponse<String> response = Client.generateHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new QueryRefundResp();
    }


    /**
     * 创建批量转账
     */
    public CreateBatchTransferResp createBatchTransfer(CreateBatchTransferReq request) {
        try {
            HttpRequest httpRequest = Client.generateHttpRequest(request, System.currentTimeMillis(), Nonce.generateNonce(9));
            HttpResponse<String> response = Client.generateHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new CreateBatchTransferResp();
    }


    /**
     * 查询批量转账
     */
    public QueryBatchTransferResp queryBatchTransfer(QueryBatchTransferReq request) {
        try {
            HttpRequest httpRequest = Client.generateHttpRequest(request, System.currentTimeMillis(), Nonce.generateNonce(9));
            HttpResponse<String> response = Client.generateHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new QueryBatchTransferResp();
    }

}
