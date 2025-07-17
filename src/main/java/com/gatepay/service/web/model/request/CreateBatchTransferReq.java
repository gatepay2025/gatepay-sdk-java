package com.gatepay.service.web.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.service.web.model.BatchOrder;


public class CreateBatchTransferReq extends BaseRequest {

    private String batchid;
    private String merchant_batch_no;
    private String bizscene;
    private String merchant_id;
    private String currency;
    private String name;
    private String description;
    private BatchOrder[] batchorderList;




    public String getBatchid() {
        return batchid;
    }

    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    public String getMerchant_batch_no() {
        return merchant_batch_no;
    }

    public void setMerchant_batch_no(String merchant_batch_no) {
        this.merchant_batch_no = merchant_batch_no;
    }

    public String getBizscene() {
        return bizscene;
    }

    public void setBizscene(String bizscene) {
        this.bizscene = bizscene;
    }

    public String getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(String merchant_id) {
        this.merchant_id = merchant_id;
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

}
