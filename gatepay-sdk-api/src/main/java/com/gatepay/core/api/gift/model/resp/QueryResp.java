package com.gatepay.core.api.gift.model.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseResponse;

public class QueryResp extends BaseResponse<QueryResp> {

    @JsonProperty("card_num")
    private String cardNum;  // 礼品卡卡号
    private String amount;  // 礼品卡金额
    private String currency;  // 礼品卡币种
    private String status;  // 礼品卡状态
                            // 0 未知状态
                            // 1 礼品卡待支付
                            // 2 未兑换
                            // 3 已兑换
                            // 4 冻结
                            // 5 支付失败
                            // 6 人工审核
                            // 7 审核驳回
                            // 8 审核支付失败

    @JsonProperty("card_temp_id")
    private String cardTempId;  // 礼品卡封面ID

    @JsonProperty("creator_name")
    private String creatorName;  // 礼品卡创建人名字

    @JsonProperty("create_time")
    private String createTime;  // 创建时间

    @JsonProperty("exchange_uid")
    private long exchangeUid;  // 兑换人
    private String key;  // 兑换码
    private String title;  // 主题

    @JsonProperty("exchange_time")
    private long exchangeTime;  // 兑换时间 标准时间戳 单位为毫秒



    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getCardTempId() {
        return cardTempId;
    }

    public void setCardTempId(String cardTempId) {
        this.cardTempId = cardTempId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public long getExchangeUid() {
        return exchangeUid;
    }

    public void setExchangeUid(long exchangeUid) {
        this.exchangeUid = exchangeUid;
    }

    public long getExchangeTime() {
        return exchangeTime;
    }

    public void setExchangeTime(long exchangeTime) {
        this.exchangeTime = exchangeTime;
    }

}
