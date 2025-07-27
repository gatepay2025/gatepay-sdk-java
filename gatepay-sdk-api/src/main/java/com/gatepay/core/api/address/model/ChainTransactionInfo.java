/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @Description 链上交易信息
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class ChainTransactionInfo {

    @JsonProperty("done_amount")
    private String doneAmount;

    @JsonProperty("confirming_list")
    private ConfirmItem[] confirmingList;


    public String getDoneAmount() {
        return doneAmount;
    }

    public void setDoneAmount(String doneAmount) {
        this.doneAmount = doneAmount;
    }

    public ConfirmItem[] getConfirmingList() {
        return confirmingList;
    }

    public void setConfirmingList(ConfirmItem[] confirmingList) {
        this.confirmingList = confirmingList;
    }
}
