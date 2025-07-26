/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.checkout.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;


public class CreateRefundReq extends BaseRequest {

    private String refundRequestId;
    private String prepayId;
    private String refundOrderCurrency;
    private String refundOrderAmount;
    private String refundPayCurrency;
    private String refundPayAmount;
    private String refundReason;
    private long receiverId;


    public CreateRefundReq() {
        this.api = GatePayApi.CHECKOUT_CREATE_REFUND;
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

    public void setReceiverId(long receiverId) {
        this.receiverId = receiverId;
    }

}
