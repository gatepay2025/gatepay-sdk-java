/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.withdraw.model.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.core.api.withdraw.model.Withdraw;
import com.gatepay.common.BaseResponse;

/**
 * @Description 查询订单响应
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class QueryOrderResp extends BaseResponse<QueryOrderResp> {

    @JsonProperty("batch_id")
    private String batchId;

    @JsonProperty("merchant_id")
    private long merchantId;

    @JsonProperty("client_id")
    private long clientId;

    private String status;

    @JsonProperty("create_time")
    private long createTime;

    @JsonProperty("withdraw_list")
    private Withdraw[] withdrawList;

    @JsonProperty("channel_id")
    private String channelId;

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

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public Withdraw[] getWithdrawList() {
        return withdrawList;
    }

    public void setWithdrawList(Withdraw[] withdrawList) {
        this.withdrawList = withdrawList;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

}
