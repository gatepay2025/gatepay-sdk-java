package com.gatepay.core.api.payment.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;


public class QueryOrderReq extends BaseRequest {

    private String prepayId;
    private String merchantTradeNo;


    public QueryOrderReq() {
        this.api = GatePayApi.PAY_QUERY_ORDER;
    }


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
