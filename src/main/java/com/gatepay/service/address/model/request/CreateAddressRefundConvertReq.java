package com.gatepay.service.address.model.request;

import com.gatepay.common.BaseRequest;

import java.math.BigDecimal;


public class CreateAddressRefundConvertReq extends BaseRequest {

    private String refundRequestId;
    private String prepayId;
    private String refundOrderCurrency;
    private BigDecimal refundOrderAmount;
    private String refundPayCurrency;
    private BigDecimal refundPayAmount;
    private String refundReason;
    private int receiverId;


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

    public BigDecimal getRefundOrderAmount() {
        return refundOrderAmount;
    }

    public void setRefundOrderAmount(BigDecimal refundOrderAmount) {
        this.refundOrderAmount = refundOrderAmount;
    }

    public String getRefundPayCurrency() {
        return refundPayCurrency;
    }

    public void setRefundPayCurrency(String refundPayCurrency) {
        this.refundPayCurrency = refundPayCurrency;
    }

    public BigDecimal getRefundPayAmount() {
        return refundPayAmount;
    }

    public void setRefundPayAmount(BigDecimal refundPayAmount) {
        this.refundPayAmount = refundPayAmount;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

}
