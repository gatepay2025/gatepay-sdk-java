package com.gatepay.core.api.payment.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;


public class CloseOrderReq extends BaseRequest {

    private String merchantTradeNo;
    private String prepayId;

    public CloseOrderReq() {
        this.api = GatePayApi.PAY_CLOSE_ORDER;
    }

    public String getMerchantTradeNo() {
        return merchantTradeNo;
    }

    public void setMerchantTradeNo(String merchantTradeNo) {
        this.merchantTradeNo = merchantTradeNo;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

}
