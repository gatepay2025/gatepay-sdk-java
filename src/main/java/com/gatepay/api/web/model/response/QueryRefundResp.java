package com.gatepay.api.web.model.response;

import com.gatepay.common.BaseResponse;


public class QueryRefundResp extends BaseResponse<QueryRefundResp> {

    private String refundRequestID;  // 商户退款单id，有商户后端生成保证唯一
    private String prepayId;  // 订单id，GatePay后端生成
    private String orderAmount;  // 订单金额
    private String refundAmount;  // 退款金额
    private String refundStatus;  // 退款单状态 SUCCESS:退款成功 FAIL:退款失败


    public String getRefundRequestID() {
        return refundRequestID;
    }

    public void setRefundRequestID(String refundRequestID) {
        this.refundRequestID = refundRequestID;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

}
