/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model.req;

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

    /**
     * 商户系统中的交易号
     */
    private String merchantTradeNo;

    /**
     * 订单币种
     */
    private String currency;

    /**
     * 订单金额
     */
    private String orderAmount;

    /**
     * 非地址支付的payCurrency在实际付款时确定，地址支付的payCurrency在下单时候确定
     */
    private String payCurrency;

    /**
     * 真实币种
     */
    private String actualCurrency;

    /**
     * 交易来源，可选值：APP、WEB、WAP、MINIAPP、OTHERS
     */
    private EnvReq env;

    /**
     * 商品
     */
    private GoodsReq goods;

    /**
     * 商户指定订单过期时间戳，毫秒为单位
     */
    private long orderExpireTime;

    /**
     * 支付完成回调地址
     */
    private String returnUrl;

    /**
     * 取消支付回调地址
     */
    private String cancelUrl;

    /**
     * 支付者在商户平台注册时的唯一ID
     */
    private long merchantUserId;

    /**
     * 所选链名字
     */
    private String chain;

    /**
     * 包含链名字的币种字段，对应到具体链的具体币种
     */
    private String fullCurrType;

    /**
     * 客户名称
     */
    private String channelId;


    public CreateOrderReq() {
        this.api = GatePayApi.ADDRESS_CREATE_ORDER;
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

    public long getMerchantUserId() {
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
