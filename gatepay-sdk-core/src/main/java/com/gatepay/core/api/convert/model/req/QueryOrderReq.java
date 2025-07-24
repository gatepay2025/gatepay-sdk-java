package com.gatepay.core.api.convert.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;


public class QueryOrderReq extends BaseRequest {

    @GatePayParam
    private String orderId;


    public QueryOrderReq() {
        this.api = GatePayApi.CONVERT_QUERY_ORDER;
    }


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

}
