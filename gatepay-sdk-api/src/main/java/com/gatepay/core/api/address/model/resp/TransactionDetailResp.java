/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseResponse;
import com.gatepay.core.api.address.model.TransactionDetail;


/**
 * @Description 交易详情响应
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class TransactionDetailResp extends BaseResponse<TransactionDetailResp> {

    /**
     * 支付单id
     */
    private String prepayId;

    /**
     * 用于申请商户账号的Gate UID
     */
    private long merchantId;

    /**
     * 商户系统交易号
     */
    private String merchantTradeNo;

    /**
     * 交易流水号
     */
    private String transactionId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 订单币种
     */
    private String currency;

    /**
     * 订单金额
     */
    private String orderAmount;

    /**
     * 用户实际支付币种
     */
    private String payCurrency;

    /**
     * 订单对应用户实际支付币种的金额
     */
    private String payAmount;

    /**
     * 订单状态
     */
    private String status;

    /**
     * 订单创建时间的utc表达，例如2023-01-07 14:04:02
     */
    private String utcCreateTime;

    /**
     * 订单过期时间的utc表达，例如2023-01-07 14:04:02
     */
    private String utcExpireTime;

    /**
     * 订单状态更新时间的utc表达，例如2023-01-07 14:04:02
     */
    private String utcUpdateTime;

    /**
     * 订单在后台完成交易的UTC毫秒时间戳
     */
    private long transactTime;

    /**
     * 订单名称
     */
    @JsonProperty("order_name")
    private String orderName;

    /**
     * 链上交易详情
     */
    private TransactionDetail transactionDetail;

    /**
     * 客户名称
     */
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
