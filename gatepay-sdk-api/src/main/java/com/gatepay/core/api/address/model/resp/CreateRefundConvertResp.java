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

    private String refundRequestId;
    private String prepayId;
    private String orderCurrency;
    private BigDecimal orderAmount;
    private BigDecimal refundOrderAmount;
    private String payCurrency;
    private BigDecimal payAmount;
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
