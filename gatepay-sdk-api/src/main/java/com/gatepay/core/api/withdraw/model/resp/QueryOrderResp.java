package com.gatepay.core.api.withdraw.model.resp;

import com.gatepay.core.api.withdraw.model.Withdraw;
import com.gatepay.common.BaseResponse;


public class QueryOrderResp extends BaseResponse<QueryOrderResp> {

    private String batch_id;
    private long merchant_id;
    private long client_id;
    private String status;
    private long create_time;
    private Withdraw[] withdraw_list;
    private String channel_id;


    public String getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(String batch_id) {
        this.batch_id = batch_id;
    }

    public long getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(long merchant_id) {
        this.merchant_id = merchant_id;
    }

    public long getClient_id() {
        return client_id;
    }

    public void setClient_id(long client_id) {
        this.client_id = client_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(long create_time) {
        this.create_time = create_time;
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
