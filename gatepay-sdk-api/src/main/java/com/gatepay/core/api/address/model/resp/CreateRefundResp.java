/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model.resp;

import com.gatepay.common.BaseResponse;


/**
 * @Description 创建退款响应
 * @author ZJ-BE
 * @Date 2025/07/25
 */
public class CreateRefundResp extends BaseResponse<CreateRefundResp> {

    /**
     * 商户退款请求id
     */
    private String refundRequestId;

    /**
     * 拟退款的订单id
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

}
