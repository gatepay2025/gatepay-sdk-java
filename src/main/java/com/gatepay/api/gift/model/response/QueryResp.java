package com.gatepay.api.gift.model.response;

import com.gatepay.common.BaseResponse;

public class QueryResp extends BaseResponse<QueryResp> {

    private String card_num;  // 礼品卡卡号
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
    private String card_temp_id;  // 礼品卡封面ID
    private String creator_name;  // 礼品卡创建人名字
    private String create_time;  // 创建时间
    private long exchange_uid;  // 兑换人
    private String key;  // 兑换码
    private String title;  // 主题
    private long exchange_time;  // 兑换时间 标准时间戳 单位为毫秒

    public String getCard_num() {
        return card_num;
    }

    public void setCard_num(String card_num) {
        this.card_num = card_num;
    }

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

    public String getCard_temp_id() {
        return card_temp_id;
    }

    public void setCard_temp_id(String card_temp_id) {
        this.card_temp_id = card_temp_id;
    }

    public String getCreator_name() {
        return creator_name;
    }

    public void setCreator_name(String creator_name) {
        this.creator_name = creator_name;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public long getExchange_uid() {
        return exchange_uid;
    }

    public void setExchange_uid(long exchange_uid) {
        this.exchange_uid = exchange_uid;
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

    public long getExchange_time() {
        return exchange_time;
    }

    public void setExchange_time(long exchange_time) {
        this.exchange_time = exchange_time;
    }

}
