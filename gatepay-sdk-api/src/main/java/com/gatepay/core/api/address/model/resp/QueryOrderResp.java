/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseResponse;
import com.gatepay.core.api.address.model.ChainTransactionInfo;


/**
 * @Description 订单查询响应
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class QueryOrderResp extends BaseResponse<QueryOrderResp> {

    /**
     * 支付单单号
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
     * 商品名，商户创建订单时提供
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
     * 用户实际支付币种，非闪兑单中与订单币种一致
     */
    private String payCurrency;

    /**
     * 用户应该支付的金额
     */
    private String payAmount;

    /**
     * 订单币种到用户支付币种的汇率，例如，1BTC换20000USDT
     */
    private String rate;

    /**
     * 订单状态，PENDING处理中，PROCESS订单有效期内支付足够金额但链上未确认完毕，PAID订单支付成功，EXPIRED订单已过期
     */
    private String status;

    /**
     * 订单的创建时间
     */
    private long createTime;

    /**
     * 订单的过期时间
     */
    private long expireTime;

    /**
     * 订单在Gate内部交易发生时间
     */
    private long transactTime;

    /**
     * 订单名称
     */
    @JsonProperty("order_name")
    private String orderName;

    /**
     * 订单在链上交易情况总览
     */
    @JsonProperty("transaction_info")
    private ChainTransactionInfo transactionInfo;

    /**
     * 客户名称
     */
    private String channelId;

    /**
     * 收款地址
     */
    private String address;

    /**
     * 网络
     */
    private String chain;


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

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
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

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(long expireTime) {
        this.expireTime = expireTime;
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
