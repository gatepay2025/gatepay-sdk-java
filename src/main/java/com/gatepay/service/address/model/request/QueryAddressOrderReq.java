package com.gatepay.service.address.model.request;

import com.gatepay.common.BaseRequest;


public class QueryAddressOrderReq extends BaseRequest {

    private String prepayId;
    private String merchantTradeNo;


    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getMerchantTradeNo() {
        return merchantTradeNo;
    }

    public void setMerchantTradeNo(String merchantTradeNo) {
        this.merchantTradeNo = merchantTradeNo;
    }
}
