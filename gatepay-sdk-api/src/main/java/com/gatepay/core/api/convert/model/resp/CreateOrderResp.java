/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.convert.model.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseResponse;

/**
 * @Description 闪兑下单响应
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class CreateOrderResp extends BaseResponse<CreateOrderResp> {

    /**
     * 订单ID
     */
    @JsonProperty("order_id")
    private String orderId;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 出售币种
     */
    private String sellCurrency;

    /**
     * 购买币种
     */
    private String buyCurrency;

    /**
     * 出售数量
     */
    private String sellAmount;

    /**
     * 购买数量
     */
    private String buyAmount;

    /**
     * 状态 1 - 创建成功 3 - 成功 6 - 失败
     */
    private String status;

    /**
     * 价格
     */
    private String rate;

    /**
     * 报价ID
     */
    private String quoteId;

    /**
     * 创建时间
     */
    private String createTime;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSellCurrency() {
        return sellCurrency;
    }

    public void setSellCurrency(String sellCurrency) {
        this.sellCurrency = sellCurrency;
    }

    public String getBuyCurrency() {
        return buyCurrency;
    }

    public void setBuyCurrency(String buyCurrency) {
        this.buyCurrency = buyCurrency;
    }

    public String getSellAmount() {
        return sellAmount;
    }

    public void setSellAmount(String sellAmount) {
        this.sellAmount = sellAmount;
    }

    public String getBuyAmount() {
        return buyAmount;
    }

    public void setBuyAmount(String buyAmount) {
        this.buyAmount = buyAmount;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}
