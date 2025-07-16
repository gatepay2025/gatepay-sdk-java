package com.gatepay.service.address.model;

import java.math.BigDecimal;

public class ChainTransactionInfo {

    private BigDecimal doneAmount;
    private ConfirmItem[] confirmingList;


    public BigDecimal getDoneAmount() {
        return doneAmount;
    }

    public void setDoneAmount(BigDecimal doneAmount) {
        this.doneAmount = doneAmount;
    }

    public ConfirmItem[] getConfirmingList() {
        return confirmingList;
    }

    public void setConfirmingList(ConfirmItem[] confirmingList) {
        this.confirmingList = confirmingList;
    }

}
