package com.gatepay.api.address.model.response;

import com.gatepay.common.BaseResponse;
import com.gatepay.api.address.model.ChainTransactionInfo;

import java.math.BigDecimal;

public class QueryOrderResp extends BaseResponse {

    private String prepayId;
    private long merchantID;
    private String merchantTradeNo;
    private String transactionId;
    private String goodsName;
    private String currency;
    private String orderAmount;
    private String payCurrency;
    private BigDecimal payAmount;
    private BigDecimal rate;
    private String status;
    private long createTime;
    private long expireTime;
    private long transactTime;
    private String orderName;
    private ChainTransactionInfo transactionInfo;
    private String channelId;         // 客户渠道名称
    private String address;           // 地址
    private String chain;             // 网络


    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public long getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(int merchantID) {
        this.merchantID = merchantID;
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

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(int expireTime) {
        this.expireTime = expireTime;
    }

    public long getTransactTime() {
        return transactTime;
    }

    public void setTransactTime(int transactTime) {
        this.transactTime = transactTime;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public ChainTransactionInfo getTransactionInfo() {
        return transactionInfo;
    }

    public void setTransactionInfo(ChainTransactionInfo transactionInfo) {
        this.transactionInfo = transactionInfo;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

}
