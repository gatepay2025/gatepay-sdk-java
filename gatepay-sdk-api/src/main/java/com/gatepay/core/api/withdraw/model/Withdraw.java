/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.withdraw.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Description 提现请求参数
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class Withdraw {

    @JsonProperty("merchant_withdraw_id")
    private String merchantWithdrawId;
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
    @JsonProperty("fee_type")
    private int feeType;

    public String getMerchantWithdrawId() {
        return merchantWithdrawId;
    }

    public void setMerchantWithdrawId(String merchantWithdrawId) {
        this.merchantWithdrawId = merchantWithdrawId;
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

    public int getFeeType() {
        return feeType;
    }

    public void setFeeType(int feeType) {
        this.feeType = feeType;
    }
}
