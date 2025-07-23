package com.gatepay.api.web.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;
import com.gatepay.common.model.req.EnvReq;
import com.gatepay.common.model.req.GoodsReq;


public class CreateOrderReq extends BaseRequest {

    private String merchantTradeNo;
    private String currency;
    private String orderAmount;
    private EnvReq env;
    private GoodsReq goods;
    private String extendInfo;
    private String channelId;


    public CreateOrderReq() {
        this.api = GatePayApi.PAY_CREATE_ORDER;
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

    public String getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }
}
