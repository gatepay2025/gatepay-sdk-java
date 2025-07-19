package com.gatepay.api.convert.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;

public class QueryPairReq extends BaseRequest {

    @GatePayParam
    private String currency;

    @GatePayParam
    private String side;


    public QueryPairReq() {
        this.api = GatePayApi.CONVERT_PAIR;
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

}
