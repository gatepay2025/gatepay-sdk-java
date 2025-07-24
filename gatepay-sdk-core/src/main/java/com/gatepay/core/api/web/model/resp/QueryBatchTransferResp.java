package com.gatepay.core.api.web.model.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BasePageResponse;
import java.util.Map;


public class QueryBatchTransferResp extends BasePageResponse<QueryBatchTransferResp> {

    private String bizCode;
    private String bizMessage;
    private BizData bizData;

    public class BizData {
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


        public String getStatus() {
            return status;
        }

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


    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public String getBizMessage() {
        return bizMessage;
    }

    public void setBizMessage(String bizMessage) {
        this.bizMessage = bizMessage;
    }

    public BizData getBizData() {
        return bizData;
    }

    public void setBizData(BizData bizData) {
        this.bizData = bizData;
    }

}
