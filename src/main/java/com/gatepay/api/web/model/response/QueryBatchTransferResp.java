package com.gatepay.api.web.model.response;

import com.gatepay.common.BaseResponse;
import java.util.Map;


public class QueryBatchTransferResp extends BaseResponse<QueryBatchTransferResp> {

    private String batch_id;
    private long merchant_id;
    private String merchant_batch_no;
    private String status;
    private String currency;
    private String channel_id;
    private Map[] orders_list;


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

    public String getMerchant_batch_no() {
        return merchant_batch_no;
    }

    public void setMerchant_batch_no(String merchant_batch_no) {
        this.merchant_batch_no = merchant_batch_no;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(String channel_id) {
        this.channel_id = channel_id;
    }

    public Map[] getOrders_list() {
        return orders_list;
    }

    public void setOrders_list(Map[] orders_list) {
        this.orders_list = orders_list;
    }

}
