package com.gatepay.api.withdraw.model.resp;

import com.gatepay.common.BaseResponse;


public class CreateOrderResp extends BaseResponse<CreateOrderResp> {

    private String batch_id;

    public String getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(String batch_id) {
        this.batch_id = batch_id;
    }

}
