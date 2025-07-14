package com.gatepay.model.address.request;

import com.gatepay.common.BaseRequest;

import java.math.BigDecimal;


public class CreateOrderRequest extends BaseRequest {

    private String merchantTradeNo;
    private String currency;
    private BigDecimal orderAmount;
    private String payCurrency;           // 非地址支付的payCurrency在实际付款时确定，地址支付的payCurrency在下单时候确定
    private String actualCurrency;        // merchant actual currency
    private EnvRequest env;
    private GoodsRequest goods;
    private int orderExpireTime;
    private String returnUrl;
    private String cancelUrl;
    private int merchantUserId;
    private String chain;
    private String fullCurrType;
    private String channelId;             // 客户渠道名称


    public String getMerchantTradeNo() {
        return merchantTradeNo;
    }

    public void setMerchantTradeNo(String merchantTradeNo) {
        this.merchantTradeNo = merchantTradeNo;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getPayCurrency() {
        return payCurrency;
    }

    public void setPayCurrency(String payCurrency) {
        this.payCurrency = payCurrency;
    }

    public String getActualCurrency() {
        return actualCurrency;
    }

    public void setActualCurrency(String actualCurrency) {
        this.actualCurrency = actualCurrency;
    }

    public EnvRequest getEnv() {
        return env;
    }

    public void setEnv(EnvRequest env) {
        this.env = env;
    }

    public GoodsRequest getGoods() {
        return goods;
    }

    public void setGoods(GoodsRequest goods) {
        this.goods = goods;
    }

    public int getOrderExpireTime() {
        return orderExpireTime;
    }

    public void setOrderExpireTime(int orderExpireTime) {
        this.orderExpireTime = orderExpireTime;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getCancelUrl() {
        return cancelUrl;
    }

    public void setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
    }

    public int getMerchantUserId() {
        return merchantUserId;
    }

    public void setMerchantUserId(int merchantUserId) {
        this.merchantUserId = merchantUserId;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getFullCurrType() {
        return fullCurrType;
    }

    public void setFullCurrType(String fullCurrType) {
        this.fullCurrType = fullCurrType;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

}
