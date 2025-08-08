/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.payment.model.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;

/**
 * @Description 查询批量转账请求
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class QueryBatchTransferReq extends BaseRequest {

    @JsonProperty("batch_id")
    @GatePayParam
    private String batchId;

    @JsonProperty("merchant_batch_no")
    @GatePayParam
    private String merchantBatchNo;

    @JsonProperty("detail_status")
    @GatePayParam
    private String detailStatus;


    public QueryBatchTransferReq() {
        this.api = GatePayApi.PAYMENT_QUERY_BATCH_TRANSFER;
    }


    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getMerchantBatchNo() {
        return merchantBatchNo;
    }

    public void setMerchantBatchNo(String merchantBatchNo) {
        this.merchantBatchNo = merchantBatchNo;
    }

    public String getDetailStatus() {
        return detailStatus;
    }

    public void setDetailStatus(String detailStatus) {
        this.detailStatus = detailStatus;
    }

}
