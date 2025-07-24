package com.gatepay.core.api.withdraw.model.req;

import com.gatepay.core.api.withdraw.model.Withdraw;
import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;


public class CreateOrderReq extends BaseRequest {

    private String batch_id;
    private Withdraw[] withdraw_list;
    private String channel_id;


    public CreateOrderReq() {
        this.api = GatePayApi.WITHDRAW_CREATE_ORDER;
    }


    public String getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(String batch_id) {
        this.batch_id = batch_id;
    }

    public Withdraw[] getWithdraw_list() {
        return withdraw_list;
    }

    public void setWithdraw_list(Withdraw[] withdraw_list) {
        this.withdraw_list = withdraw_list;
    }

    public String getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(String channel_id) {
        this.channel_id = channel_id;
    }

}
