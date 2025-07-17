package com.gatepay.apis.address.model;

import java.math.BigDecimal;

public class ConfirmItem {

    private BigDecimal amount;
    private int confirm;


    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getConfirm() {
        return confirm;
    }

    public void setConfirm(int confirm) {
        this.confirm = confirm;
    }

}
