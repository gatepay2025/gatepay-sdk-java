package com.gatepay.api.address.model;

import java.math.BigDecimal;

public class TxItem {

    private String chain;
    private String address;
    private String fullCurrType;
    private BigDecimal amount;
    private String txId;
    private String utcCreateTime;
    private String utcUpdateTime;


    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullCurrType() {
        return fullCurrType;
    }

    public void setFullCurrType(String fullCurrType) {
        this.fullCurrType = fullCurrType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public String getUtcCreateTime() {
        return utcCreateTime;
    }

    public void setUtcCreateTime(String utcCreateTime) {
        this.utcCreateTime = utcCreateTime;
    }

    public String getUtcUpdateTime() {
        return utcUpdateTime;
    }

    public void setUtcUpdateTime(String utcUpdateTime) {
        this.utcUpdateTime = utcUpdateTime;
    }
}
