package com.gatepay.service.address.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;


public class CreateRefundConvertReq extends BaseRequest {

    private String refundRequestId;
    private String prepayId;
    private String refundOrderCurrency;
    private String refundOrderAmount;
    private String refundPayCurrency;
    private String refundPayAmount;
    private String refundReason;
    private long receiverId;


    public CreateRefundConvertReq() {
        this.api = GatePayApi.ADDRESS_CREATE_REFUND_CONVERT;
    }


    public String getRefundRequestId() {
        return refundRequestId;
    }

    public void setRefundRequestId(String refundRequestId) {
        this.refundRequestId = refundRequestId;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getRefundOrderCurrency() {
        return refundOrderCurrency;
    }

    public void setRefundOrderCurrency(String refundOrderCurrency) {
        this.refundOrderCurrency = refundOrderCurrency;
    }

    public String getRefundOrderAmount() {
        return refundOrderAmount;
    }

    public void setRefundOrderAmount(String refundOrderAmount) {
        this.refundOrderAmount = refundOrderAmount;
    }

    public String getRefundPayCurrency() {
        return refundPayCurrency;
    }

    public void setRefundPayCurrency(String refundPayCurrency) {
        this.refundPayCurrency = refundPayCurrency;
    }

    public String getRefundPayAmount() {
        return refundPayAmount;
    }

    public void setRefundPayAmount(String refundPayAmount) {
        this.refundPayAmount = refundPayAmount;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

}
