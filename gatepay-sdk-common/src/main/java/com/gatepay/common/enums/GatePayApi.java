/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.common.enums;


/**
 * @Description GatePayApi 请求地址、请求方法
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public enum GatePayApi {

    ADDRESS_CHAINS("/v1/pay/address/chains", "GET"),
    ADDRESS_CURRENCIES("/v1/pay/address/currencies", "GET"),
    ADDRESS_SUPPORTED_CONVERT_CURRENCIES("/v1/pay/address/supportedconvertcurrencies", "GET"),
    ADDRESS_CREATE_ORDER("/v1/pay/address/create", "POST"),
    ADDRESS_QUERY_ORDER("/v1/pay/address/query", "GET"),
    ADDRESS_CREATE_REFUND("/v1/pay/address/refund", "POST"),
    ADDRESS_CREATE_REFUND_CONVERT("/v1/pay/address/refundconvert", "POST"),
    ADDRESS_TRANSACTION_DETAIL("/v1/pay/address/transactiondetail", "GET"),
    PAYMENT_CREATE_ORDER("/v1/pay/order", "POST"),
    PAYMENT_CLOSE_ORDER("/v1/pay/order/close", "POST"),
    PAYMENT_QUERY_ORDER("/v1/pay/order/query", "POST"),
    PAYMENT_CREATE_REFUND("/v1/pay/order/refund", "POST"),
    PAYMENT_QUERY_REFUND("/v1/pay/order/refund/query", "POST"),
    PAYMENT_CREATE_BATCH_TRANSFER("/v1/pay/batch/transfer", "POST"),
    PAYMENT_QUERY_BATCH_TRANSFER("/v1/pay/batch/transfer/query", "POST"),
    PAYMENT_QUERY_BALANCE("/v1/pay/balance", "GET"),
    CHECKOUT_CREATE_ORDER("/v1/pay/checkout/order", "POST"),
    CHECKOUT_CREATE_REFUND("/v1/pay/checkout/refund", "POST"),
    CHANNEL_MANAGE_SAVE("/v1/pay/channelmanage/save", "POST"),
    CHANNEL_MANAGE_LIST("/v1/pay/channelmanage/list", "GET"),
    CHANNEL_MANAGE_UPDATE("/v1/pay/channelmanage/update", "PUT"),
    CHANNEL_MANAGE_DELETE("/v1/pay/channelmanage/delete", "DELETE"),
    WITHDRAW_CREATE_ORDER("/v1/pay/withdraw", "POST"),
    WITHDRAW_QUERY_ORDER("/v1/pay/withdraw/query", "POST"),
    WITHDRQW_CURRENCY_CHAINS("/v1/pay/wallet/currency_chains", "GET"),
    WITHDRAW_QUERY_BALANCE("/v1/pay/wallet/total_balance", "GET"),
    WITHDRAW_QUERY_STATUS("/v1/pay/wallet/withdraw_status", "GET"),
    QR_CODE_CREATE_ORDER("/v1/pay/transactions/native", "POST"),
    GIFT_CREATE("/v1/pay/gift/create", "POST"),
    GIFT_LIST_TEMPLATE("/v1/pay/gift/temp/list", "GET"),
    GIFT_QUERY("/v1/pay/gift/query", "POST"),
    CONVERT_CURRENCY("/v1/pay/convert/currency", "GET"),
    CONVERT_PAIR("/v1/pay/convert/pair", "GET"),
    CONVERT_PREVIEW("/v1/pay/convert/preview", "POST"),
    CONVERT_CREATE_ORDER("/v1/pay/convert", "POST"),
    CONVERT_QUERY_ORDER("/v1/pay/convert/order", "GET"),
    BILL_QUERY_ORDERS("/v1/pay/bill/orderlist", "GET"),
    ;


    private String url;
    private String httpMethod;


    GatePayApi(String url, String httpMethod) {
        this.url = url;
        this.httpMethod = httpMethod;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

}
