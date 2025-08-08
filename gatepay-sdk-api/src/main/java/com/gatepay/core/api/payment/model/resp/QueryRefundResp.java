/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.payment.model.resp;

import com.gatepay.common.BaseResponse;


/**
 * @Description: 查询退款响应
 * @Author: ZJ-BE
 * @Date: 2025/07/25
 */
public class QueryRefundResp extends BaseResponse<QueryRefundResp> {

    /**
     * 商户退款单id，有商户后端生成保证唯一
     */
    private String refundRequestId;

    /**
     * 订单id，GatePay后端生成
     */
    private String prepayId;

    /**
     * 订单金额
     */
    private String orderAmount;

    /**
     * 退款金额
     */
    private String refundAmount;

    /**
     * 退款单状态 SUCCESS:退款成功 FAIL:退款失败
     */
    private String refundStatus;
    private String channelId;


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

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }
}
