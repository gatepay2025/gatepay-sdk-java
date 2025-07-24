package com.gatepay.core.api.web.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BatchOrder {

    @JsonProperty("user_id")
    private long userId;

    private String amount;


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

}
