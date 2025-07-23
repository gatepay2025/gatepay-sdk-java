package com.gatepay.api.web.model.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseResponse;
import java.util.Map;


public class QueryBatchTransferResp extends BaseResponse<QueryBatchTransferResp> {

    @JsonProperty("batch_id")
    private String batchId;

    @JsonProperty("merchant_id")
    private long merchantId;

    @JsonProperty("merchant_batch_no")
    private String merchantBatchNo;
    private String status;
    private String currency;

    @JsonProperty("channel_id")
    private String channelId;

    @JsonProperty("orders_list")
    private Map[] ordersList;




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

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(long merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantBatchNo() {
        return merchantBatchNo;
    }

    public void setMerchantBatchNo(String merchantBatchNo) {
        this.merchantBatchNo = merchantBatchNo;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Map[] getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(Map[] ordersList) {
        this.ordersList = ordersList;
    }

}
