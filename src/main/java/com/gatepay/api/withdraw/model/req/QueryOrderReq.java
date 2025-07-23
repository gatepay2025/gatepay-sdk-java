package com.gatepay.api.withdraw.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;


public class QueryOrderReq extends BaseRequest {

    private String batch_id;
    private String detail_status;


    public QueryOrderReq() {
        this.api = GatePayApi.WITHDRAW_QUERY_ORDER;
    }


    public String getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(String batch_id) {
        this.batch_id = batch_id;
    }

    public String getDetail_status() {
        return detail_status;
    }

    public void setDetail_status(String detail_status) {
        this.detail_status = detail_status;
    }

}
