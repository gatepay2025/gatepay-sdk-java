package com.gatepay.service.checkout.model.request;

public class CreateRefundReq {

    private String refundRequestId;
    private String prepayId;
    private String refundOrderCurrency;
    private String refundOrderAmount;
    private String refundPayCurrency;
    private String refundPayAmount;
    private String refundReason;
    private long receiverId;

}
