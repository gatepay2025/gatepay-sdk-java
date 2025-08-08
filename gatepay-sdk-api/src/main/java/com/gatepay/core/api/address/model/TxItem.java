/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model;

/**
 * @Description 交易项
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class TxItem {

    private String chain;
    private String address;
    private String fullCurrType;
    private String amount;
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
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
