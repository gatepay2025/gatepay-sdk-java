package com.gatepay.service.web.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.GatePayConstants;

public class QueryOrderReq extends BaseRequest {

    private String prepayId;
    private String merchantTradeNo;

    public QueryOrderReq() {
        this.requestUrl = super.requestUrl + GatePayConstants.END_POINT_PAY_ORDER_QUERY;
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
