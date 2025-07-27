/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.withdraw.model.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.core.api.withdraw.model.Withdraw;
import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;


/**
 * @Description 创建订单请求
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class CreateOrderReq extends BaseRequest {

    /**
     * 批次id
     */
    @JsonProperty("batch_id")
    private String batchId;

    @JsonProperty("withdraw_list")
    private Withdraw[] withdraws;

    @JsonProperty("channel_id")
    private String channelId;


    public CreateOrderReq() {
        this.api = GatePayApi.WITHDRAW_CREATE_ORDER;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public Withdraw[] getWithdraws() {
        return withdraws;
    }

    public void setWithdraws(Withdraw[] withdraws) {
        this.withdraws = withdraws;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

}
