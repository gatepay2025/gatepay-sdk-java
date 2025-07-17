package com.gatepay.api.web.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;


public class QueryOrderReq extends BaseRequest {

    @GatePayParam
    private String prepayId;

    @GatePayParam
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
