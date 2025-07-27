/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.withdraw.model.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseResponse;

/**
 * @Description 创建订单响应
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class CreateOrderResp extends BaseResponse<CreateOrderResp> {

    @JsonProperty("batch_id")
    private String batchId;

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }
}
