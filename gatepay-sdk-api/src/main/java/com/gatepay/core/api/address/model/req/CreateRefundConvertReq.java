/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;


/**
 * @Description 创建闪兑支付单退款请求
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class CreateRefundConvertReq extends BaseRequest {

    /**
     * 商户请求退款编号
     */
    private String refundRequestId;

    /**
     * 对应支付单订单id
     */
    private String prepayId;

    /**
     * 退款订单币种
     */
    private String refundOrderCurrency;

    /**
     * 退款订单币种对应退款金额
     */
    private String refundOrderAmount;

    /**
     * 退款订单支付币种
     */
    private String refundPayCurrency;

    /**
     * 退款订单支付币种对应退款金额
     */
    private String refundPayAmount;

    /**
     * 退款原因
     */
    private String refundReason;

    /**
     * 地址支付退款接收人在gate系统的user_id
     */
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
