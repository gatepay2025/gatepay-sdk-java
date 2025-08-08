/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model;


public class TxDetailStateItem {

    private String amount;
    private TxItem[] txList;


    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public TxItem[] getTxList() {
        return txList;
    }

    public void setTxList(TxItem[] txList) {
        this.txList = txList;
    }

}
