package com.gatepay.api.gift.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;


public class QueryReq extends BaseRequest {

    @GatePayParam(required = false)
    private String card_number;

    @GatePayParam(required = false)
    private String key;

    public QueryReq() {
        this.api = GatePayApi.GIFT_QUERY;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
