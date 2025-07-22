package com.gatepay.api.address.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ChainTransactionInfo {

    @JsonProperty("done_amount")
    private String doneAmount;

    @JsonProperty("confirming_list")
    private ConfirmItem[] confirmingList;


    public String getDoneAmount() {
        return doneAmount;
    }

    public void setDoneAmount(String doneAmount) {
        this.doneAmount = doneAmount;
    }

    public ConfirmItem[] getConfirmingList() {
        return confirmingList;
    }

    public void setConfirmingList(ConfirmItem[] confirmingList) {
        this.confirmingList = confirmingList;
    }
}
