package com.gatepay.api.address.model;


public class ChainTransactionInfo {

    private String done_amount;
    private ConfirmItem[] confirming_list;


    public String getDone_amount() {
        return done_amount;
    }

    public void setDone_amount(String done_amount) {
        this.done_amount = done_amount;
    }

    public ConfirmItem[] getConfirming_list() {
        return confirming_list;
    }

    public void setConfirming_list(ConfirmItem[] confirming_list) {
        this.confirming_list = confirming_list;
    }
}
