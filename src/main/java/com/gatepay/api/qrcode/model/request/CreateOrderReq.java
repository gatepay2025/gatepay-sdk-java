package com.gatepay.api.qrcode.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;
import com.gatepay.common.model.EnvReq;
import com.gatepay.common.model.GoodsReq;


public class CreateOrderReq extends BaseRequest {

    private String MerchantTradeNo;
    private String currency;
    private String orderAmount;
    private EnvReq env;
    private GoodsReq goods;
    private String returnUrl;


    public CreateOrderReq() {
        this.api = GatePayApi.QR_CODE_CREATE_ORDER;
    }


    public String getMerchantTradeNo() {
        return MerchantTradeNo;
    }

    public void setMerchantTradeNo(String merchantTradeNo) {
        MerchantTradeNo = merchantTradeNo;
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

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

}
