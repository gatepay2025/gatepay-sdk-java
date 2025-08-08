/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model.resp;

import com.gatepay.common.BaseResponse;

import java.math.BigDecimal;

/**
 * @Description 创建闪兑退款响应
 * @author ZJ-BE
 * @Date 2025/07/25
 */
public class CreateRefundConvertResp extends BaseResponse {

    /**
     * 商户退款请求id
     */
    private String refundRequestId;

    /**
     * 拟退款的订单id
     */
    private String prepayId;

    /**
     * 订单币种
     */
    private String orderCurrency;

    /**
     * 订单金额
     */
    private BigDecimal orderAmount;

    /**
     * 对应订单币种的退款金额
     */
    private BigDecimal refundOrderAmount;

    /**
     * 用户支付币种
     */
    private String payCurrency;

    /**
     * 订单中用户应该支付的金额
     */
    private BigDecimal payAmount;

    /**
     * 对应订单用户支付币种的退款金额
     */
    private BigDecimal refundPayAmount;


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

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getRefundOrderAmount() {
        return refundOrderAmount;
    }

    public void setRefundOrderAmount(BigDecimal refundOrderAmount) {
        this.refundOrderAmount = refundOrderAmount;
    }

    public String getPayCurrency() {
        return payCurrency;
    }

    public void setPayCurrency(String payCurrency) {
        this.payCurrency = payCurrency;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public BigDecimal getRefundPayAmount() {
        return refundPayAmount;
    }

    public void setRefundPayAmount(BigDecimal refundPayAmount) {
        this.refundPayAmount = refundPayAmount;
    }

}
