package com.gatepay.service.address.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.GatePayConstants;
import com.gatepay.common.annotation.GatePayRequestParam;


public class QueryOrderReq extends BaseRequest {

    @GatePayRequestParam
    private String prepayId;

    @GatePayRequestParam
    private String merchantTradeNo;


    public QueryOrderReq() {
        this.requestUrl = GatePayConstants.END_POINT_ADDRESS_QUERY_ORDER;
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
