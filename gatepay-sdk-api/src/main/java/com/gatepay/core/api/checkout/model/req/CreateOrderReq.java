/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.checkout.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;
import com.gatepay.common.model.req.EnvReq;
import com.gatepay.common.model.req.GoodsReq;

public class CreateOrderReq extends BaseRequest {

    private String merchantTradeNo;
    private EnvReq env;
    private String currency;
    private String orderAmount;
    private String payCurrency;
    private long merchantUserId;
    private GoodsReq goods;
    private String returnUrl;
    private String cancelUrl;
    private String chain;
    private String fullCurrType;
    private String channelId;


    public CreateOrderReq() {
        this.api = GatePayApi.CHECKOUT_CREATE_ORDER;
    }


    public String getMerchantTradeNo() {
        return merchantTradeNo;
    }

    public void setMerchantTradeNo(String merchantTradeNo) {
        this.merchantTradeNo = merchantTradeNo;
    }

    public EnvReq getEnv() {
        return env;
    }

    public void setEnv(EnvReq env) {
        this.env = env;
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

    public long getMerchantUserId() {
        return merchantUserId;
    }

    public void setMerchantUserId(int merchantUserId) {
        this.merchantUserId = merchantUserId;
    }

    public GoodsReq getGoods() {
        return goods;
    }

    public void setGoods(GoodsReq goods) {
        this.goods = goods;
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
