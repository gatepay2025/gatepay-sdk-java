/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.bill.model.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseResponse;

public class QueryOrdersResp extends BaseResponse<QueryOrdersResp> {

    @JsonProperty("merchant_id")
    private long merchantId;
    private long total;
    private boolean hasNext;
    private long nextPage;

    @JsonProperty("balance_history_item_list")
    private BalanceHistoryItem[] balanceHistoryItemList;


    private static class BalanceHistoryItem {
        private String transactId;  // 支付流水单号
        private long transactTime;  // 入账时间，毫秒时间戳
        private String orderId;  // GatePay订单号
        private String merchantTradeNo;  // 商户订单号
        private String financialType;  // 财务类型
        private String payAmount;  // 收支金额
        private String currency;  // 收支币种
        private String balance;  // 账户余额
        private String balanceCurrency; // 账户余额币种
        private String status;  // PAID表示成功
        private long payer;  // Gate支付付款用户UID
        private String buyer;  // 对方信息: Web3支付该值为付款地址，非Web3支付为付款人UID

        @JsonProperty("refund_gate_id")
        private String refundGateId;  // 退款订单ID
        private String payChannel;  // 支付方式: Web3 支付, Gate 支付
        private String fullChain;  // 支付网络全称
        private String address;  // 商家收款地址
        private String hash;  // 交易hash

        public String getTransactId() {
            return transactId;
        }

        public void setTransactId(String transactId) {
            this.transactId = transactId;
        }

        public long getTransactTime() {
            return transactTime;
        }

        public void setTransactTime(long transactTime) {
            this.transactTime = transactTime;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getMerchantTradeNo() {
            return merchantTradeNo;
        }

        public void setMerchantTradeNo(String merchantTradeNo) {
            this.merchantTradeNo = merchantTradeNo;
        }

        public String getFinancialType() {
            return financialType;
        }

        public void setFinancialType(String financialType) {
            this.financialType = financialType;
        }

        public String getPayAmount() {
            return payAmount;
        }

        public void setPayAmount(String payAmount) {
            this.payAmount = payAmount;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getBalance() {
            return balance;
        }

        public void setBalance(String balance) {
            this.balance = balance;
        }

        public String getBalanceCurrency() {
            return balanceCurrency;
        }

        public void setBalanceCurrency(String balanceCurrency) {
            this.balanceCurrency = balanceCurrency;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public long getPayer() {
            return payer;
        }

        public void setPayer(long payer) {
            this.payer = payer;
        }

        public String getBuyer() {
            return buyer;
        }

        public void setBuyer(String buyer) {
            this.buyer = buyer;
        }

        public String getRefundGateId() {
            return refundGateId;
        }

        public void setRefundGateId(String refundGateId) {
            this.refundGateId = refundGateId;
        }

        public String getPayChannel() {
            return payChannel;
        }

        public void setPayChannel(String payChannel) {
            this.payChannel = payChannel;
        }

        public String getFullChain() {
            return fullChain;
        }

        public void setFullChain(String fullChain) {
            this.fullChain = fullChain;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getHash() {
            return hash;
        }

        public void setHash(String hash) {
            this.hash = hash;
        }
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public long getNextPage() {
        return nextPage;
    }

    public void setNextPage(long nextPage) {
        this.nextPage = nextPage;
    }

    public long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(long merchantId) {
        this.merchantId = merchantId;
    }

    public BalanceHistoryItem[] getBalanceHistoryItemList() {
        return balanceHistoryItemList;
    }

    public void setBalanceHistoryItemList(BalanceHistoryItem[] balanceHistoryItemList) {
        this.balanceHistoryItemList = balanceHistoryItemList;
    }
}
