package com.gatepay.api.convert.model.response;

import com.gatepay.common.BaseResponse;


public class CreateOrderResp extends BaseResponse<CreateOrderResp> {

    private String order_id;  // 订单ID
    private String userId;  // 用户ID
    private String sellCurrency;  // 出售币种
    private String buyCurrency;  // 购买币种
    private String sellAmount;  // 出售数量
    private String buyAmount;  // 购买数量
    private String status;  // 状态 1 - 创建成功 3 - 成功 6 - 失败
    private String rate;  // 价格
    private String quoteId;  // 报价ID
    private String createTime;  // 创建时间


    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
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
