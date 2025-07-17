package com.gatepay.api.address.model;

import java.math.BigDecimal;

public class TxDetailStateItem {

    private BigDecimal amount;
    private TxItem[] txList;


    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public TxItem[] getTxList() {
        return txList;
    }

    public void setTxList(TxItem[] txList) {
        this.txList = txList;
    }

}
