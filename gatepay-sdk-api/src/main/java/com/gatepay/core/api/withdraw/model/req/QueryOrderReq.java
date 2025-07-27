/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.withdraw.model.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;

/**
 * @Description 查询订单请求
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class QueryOrderReq extends BaseRequest {

    @JsonProperty("batch_id")
    private String batchId;

    @JsonProperty("detail_status")
    private String detailStatus;


    public QueryOrderReq() {
        this.api = GatePayApi.WITHDRAW_QUERY_ORDER;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getDetailStatus() {
        return detailStatus;
    }

    public void setDetailStatus(String detailStatus) {
        this.detailStatus = detailStatus;
    }
}
