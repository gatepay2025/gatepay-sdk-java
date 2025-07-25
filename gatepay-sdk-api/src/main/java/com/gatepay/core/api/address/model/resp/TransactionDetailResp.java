/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseResponse;
import com.gatepay.core.api.address.model.TransactionDetail;

public class TransactionDetailResp extends BaseResponse<TransactionDetailResp> {

    private String prepayId;
    private long merchantId;
    private String merchantTradeNo;
    private String transactionId;
    private String goodsName;
    private String currency;
    private String orderAmount;
    private String payCurrency;
    private String payAmount;
    private String status;
    private String utcCreateTime;
    private String utcExpireTime;
    private String utcUpdateTime;
    private long transactTime;

    @JsonProperty("order_name")
    private String orderName;
    private TransactionDetail transactionDetail;
    private String channelId;


    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(long merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantTradeNo() {
        return merchantTradeNo;
    }

    public void setMerchantTradeNo(String merchantTradeNo) {
        this.merchantTradeNo = merchantTradeNo;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUtcCreateTime() {
        return utcCreateTime;
    }

    public void setUtcCreateTime(String utcCreateTime) {
        this.utcCreateTime = utcCreateTime;
    }

    public String getUtcExpireTime() {
        return utcExpireTime;
    }

    public void setUtcExpireTime(String utcExpireTime) {
        this.utcExpireTime = utcExpireTime;
    }

    public String getUtcUpdateTime() {
        return utcUpdateTime;
    }

    public void setUtcUpdateTime(String utcUpdateTime) {
        this.utcUpdateTime = utcUpdateTime;
    }

    public long getTransactTime() {
        return transactTime;
    }

    public void setTransactTime(long transactTime) {
        this.transactTime = transactTime;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }

    public void setTransactionDetail(TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

}
