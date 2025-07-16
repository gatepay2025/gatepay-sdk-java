package com.gatepay.service.payment.model.request;

import com.gatepay.common.BaseRequest;


public class OperateOrderRequest extends BaseRequest {

    private String prepayId;
    private String merchantTradeNo;

    public String getPrepayId() {
        return this.prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getMerchantTradeNo() {
        return this.merchantTradeNo;
    }

    public void setMerchantTradeNo(String merchantTradeNo) {
        this.merchantTradeNo = merchantTradeNo;
    }

}
