package com.gatepay.api.withdraw.model;

public class Withdraw {

    private String merchant_withdraw_id;
    private String currency;
    private String amount;
    private String chain;
    private String address;
    private String memo;

    /*
    提现手续费的收取方式：
       如果选择内扣，则手续费将从提现金额中收取，到账金额为提现金额扣除手续费；
       如果选择外收，则手续费将从账户余额中扣除，到账金额即为提现金额。
    存量不传默认为内扣的方式
    类型枚举：
       0-内扣
       1-外收
    */
    private int fee_type;


    public String getMerchant_withdraw_id() {
        return merchant_withdraw_id;
    }

    public void setMerchant_withdraw_id(String merchant_withdraw_id) {
        this.merchant_withdraw_id = merchant_withdraw_id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public int getFee_type() {
        return fee_type;
    }

    public void setFee_type(int fee_type) {
        this.fee_type = fee_type;
    }

}
