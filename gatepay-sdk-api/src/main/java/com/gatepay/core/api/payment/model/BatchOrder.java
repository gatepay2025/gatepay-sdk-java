/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.payment.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Description 批次订单
 * @Author: ZJ-BE
 * @Date: 2025/07/25
 */
public class BatchOrder {

    @JsonProperty("user_id")
    private long userId;

    private String amount;


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

}
