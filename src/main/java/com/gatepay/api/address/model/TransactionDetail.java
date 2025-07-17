package com.gatepay.api.address.model;

public class TransactionDetail {

    private TxDetail inTerm;
    private TxDetail outOfTerm;


    public TxDetail getInTerm() {
        return inTerm;
    }

    public void setInTerm(TxDetail inTerm) {
        this.inTerm = inTerm;
    }

    public TxDetail getOutOfTerm() {
        return outOfTerm;
    }

    public void setOutOfTerm(TxDetail outOfTerm) {
        this.outOfTerm = outOfTerm;
    }

}
