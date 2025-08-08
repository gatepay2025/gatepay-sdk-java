/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.payment.model.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseResponse;


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
    private Order[] orders;


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

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public static class Order {
        @JsonProperty("receiver_id")
        private long receiverId;
        private String amount;
        private String currency;
        private String status;

        @JsonProperty("reward_id")
        private String rewardId;

        @JsonProperty("transaction_id")
        private String transactionId;

        @JsonProperty("create_time")
        private long createTime;

        @JsonProperty("channel_id")
        private String channelId;

        public long getReceiverId() {
            return receiverId;
        }

        public void setReceiverId(long receiverId) {
            this.receiverId = receiverId;
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

        public String getRewardId() {
            return rewardId;
        }

        public void setRewardId(String rewardId) {
            this.rewardId = rewardId;
        }

        public String getTransactionId() {
            return transactionId;
        }

        public void setTransactionId(String transactionId) {
            this.transactionId = transactionId;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public String getChannelId() {
            return channelId;
        }

        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }
    }

}
