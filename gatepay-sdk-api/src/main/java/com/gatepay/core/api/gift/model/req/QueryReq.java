package com.gatepay.core.api.gift.model.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;


public class QueryReq extends BaseRequest {

    @JsonProperty("card_number")
    @GatePayParam(required = false)
    private String cardNumber;

    @GatePayParam(required = false)
    private String key;

    public QueryReq() {
        this.api = GatePayApi.GIFT_QUERY;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
