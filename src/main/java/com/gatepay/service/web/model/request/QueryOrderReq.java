package com.gatepay.service.web.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.GatePayConstants;
import com.gatepay.common.annotation.GatePayParam;

public class QueryOrderReq extends BaseRequest {

    @GatePayParam
    private String prepayId;

    @GatePayParam
    private String merchantTradeNo;


    public QueryOrderReq() {
        this.requestUrl = GatePayConstants.END_POINT_PAY_ORDER_QUERY;
        this.requestMethod = GatePayConstants.METHOD_GET;
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
