/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.qrcode.model.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;
import com.gatepay.common.model.req.EnvReq;
import com.gatepay.common.model.req.GoodsReq;

/**
 * @Description 创建订单请求
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class CreateOrderReq extends BaseRequest {

    @JsonProperty("MerchantTradeNo")
    private String merchantTradeNo;
    private String currency;
    private String orderAmount;
    private EnvReq env;
    private GoodsReq goods;
    private String returnUrl;


    public CreateOrderReq() {
        this.api = GatePayApi.QR_CODE_CREATE_ORDER;
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

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

}
