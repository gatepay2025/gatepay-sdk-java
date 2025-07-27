/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.payment.model.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;
import com.gatepay.core.api.payment.model.BatchOrder;


public class CreateBatchTransferReq extends BaseRequest {

    private String batchid;

    @JsonProperty("merchant_batch_no")
    private String merchantBatchNo;
    private String bizscene;

    @JsonProperty("merchant_id")
    private String merchantId;

    @JsonProperty("client_id")
    private String clientId;
    private String currency;
    private String name;
    private String description;
    private BatchOrder[] batchorderList;


    public CreateBatchTransferReq() {
        this.api = GatePayApi.PAYMENT_CREATE_BATCH_TRANSFER;
    }


    public String getBatchid() {
        return batchid;
    }

    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    public String getBizscene() {
        return bizscene;
    }

    public void setBizscene(String bizscene) {
        this.bizscene = bizscene;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BatchOrder[] getBatchorderList() {
        return batchorderList;
    }

    public void setBatchorderList(BatchOrder[] batchorderList) {
        this.batchorderList = batchorderList;
    }

    public String getMerchantBatchNo() {
        return merchantBatchNo;
    }

    public void setMerchantBatchNo(String merchantBatchNo) {
        this.merchantBatchNo = merchantBatchNo;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

}
