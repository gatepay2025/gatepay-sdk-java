/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.checkout.model.resp;

import com.gatepay.common.BaseResponse;


public class CreateRefundResp extends BaseResponse<CreateRefundResp> {

    private String refundRequestId;  // 商户退款请求id
    private String prepayId;  // 拟退款的订单id
    private String orderCurrency;  // 订单币种
    private String orderAmount;  // 订单金额
    private String refundOrderAmount;  // 退款商户已收到的用户支付的全部金额
    private String payCurrency;  // 用户支付币种
    private String payAmount;  // 订单中用户应该支付的金额
    private String refundPayAmount;  // 用户支付后，退款残留于链上的金额。商户没有收到这部分资金（闪兑场景）


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

    public String getOrderCurrency() {
        return orderCurrency;
    }

    public void setOrderCurrency(String orderCurrency) {
        this.orderCurrency = orderCurrency;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getRefundOrderAmount() {
        return refundOrderAmount;
    }

    public void setRefundOrderAmount(String refundOrderAmount) {
        this.refundOrderAmount = refundOrderAmount;
    }

    public String getPayCurrency() {
        return payCurrency;
    }

    public void setPayCurrency(String payCurrency) {
        this.payCurrency = payCurrency;
    }

    public String getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount;
    }

    public String getRefundPayAmount() {
        return refundPayAmount;
    }

    public void setRefundPayAmount(String refundPayAmount) {
        this.refundPayAmount = refundPayAmount;
    }

}
