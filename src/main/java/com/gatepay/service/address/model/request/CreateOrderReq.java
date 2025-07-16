package com.gatepay.service.address.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.GatePayConstants;
import com.gatepay.common.model.EnvReq;
import com.gatepay.common.model.GoodsReq;


public class CreateOrderReq extends BaseRequest {

    private String merchantTradeNo;
    private String currency;
    private String orderAmount;
    private String payCurrency;           // 非地址支付的payCurrency在实际付款时确定，地址支付的payCurrency在下单时候确定
    private String actualCurrency;        // merchant actual currency
    private EnvReq env;
    private GoodsReq goods;
    private long orderExpireTime;
    private String returnUrl;
    private String cancelUrl;
    private int merchantUserId;
    private String chain;
    private String fullCurrType;
    private String channelId;             // 客户渠道名称


    public CreateOrderReq() {
        this.requestUrl = super.requestUrl + GatePayConstants.END_POINT_ADDRESS_CREATE_ORDER;
    }

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

    public String getActualCurrency() {
        return actualCurrency;
    }

    public void setActualCurrency(String actualCurrency) {
        this.actualCurrency = actualCurrency;
    }

    public EnvReq getEnv() {
        return env;
    }

    public void setEnv(EnvReq env) {
        this.env = env;
    }

    public GoodsReq getGoods() {
        return goods;
    }

    public void setGoods(GoodsReq goods) {
        this.goods = goods;
    }

    public long getOrderExpireTime() {
        return orderExpireTime;
    }

    public void setOrderExpireTime(long orderExpireTime) {
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
