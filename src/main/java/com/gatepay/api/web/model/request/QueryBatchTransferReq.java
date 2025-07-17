package com.gatepay.api.web.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;


public class QueryBatchTransferReq extends BaseRequest {

    @GatePayParam
    private String batch_id;

    @GatePayParam
    private String merchant_batch_no;

    @GatePayParam
    private String detail_status;


    public QueryBatchTransferReq() {
        this.api = GatePayApi.PAY_QUERY_BATCH_TRANSFER;
    }


    public String getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(String batch_id) {
        this.batch_id = batch_id;
    }

    public String getMerchant_batch_no() {
        return merchant_batch_no;
    }

    public void setMerchant_batch_no(String merchant_batch_no) {
        this.merchant_batch_no = merchant_batch_no;
    }

    public String getDetail_status() {
        return detail_status;
    }

    public void setDetail_status(String detail_status) {
        this.detail_status = detail_status;
    }

}
