package com.gatepay.api.gift.model.response;

import com.gatepay.common.BaseResponse;

public class CreateResp extends BaseResponse<CreateResp> {

    private String card_num;  //  礼品卡卡号
    private String card_key;  // 礼品卡兑换码
    private String amount;  // 礼品卡金额
    private String currency;  // 礼品卡币种
    private String status;  // 礼品卡状态
                            //    0 未知状态
    //    1 礼品卡待支付
    //                           2 未兑换
    //                          3 已兑换
    //                          4 冻结
    //                          5 支付失败
    //                          6 人工审核
    //                          7 审核驳回
                            //                          8 审核支付失败
    private String card_temp_id;  // 礼品卡封面ID
    private String creator_name;  // 礼品卡创建人名字
    private String create_time;  // 创建时间


    public String getCard_num() {
        return card_num;
    }

    public void setCard_num(String card_num) {
        this.card_num = card_num;
    }

    public String getCard_key() {
        return card_key;
    }

    public void setCard_key(String card_key) {
        this.card_key = card_key;
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

    @Override
    public String getStatus() {
        return status;
    }

    @Override
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

}
