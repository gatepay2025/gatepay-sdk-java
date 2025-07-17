package com.gatepay.common.enums;


public enum GatePayApi {

    ADDRESS_CHAINS("/v1/pay/address/chains", "GET"),
    ADDRESS_CURRENCIES("/v1/pay/address/currencies", "GET"),
    ADDRESS_SUPPORTED_CONVERT_CURRENCIES("/v1/pay/address/supportedconvertcurrencies", "GET"),
    ADDRESS_CREATE_ORDER("/v1/pay/address/create", "POST"),
    ADDRESS_QUERY_ORDER("/v1/pay/address/query", "GET"),
    ADDRESS_CREATE_REFUND("/v1/pay/address/refund", "POST"),
    ADDRESS_CREATE_REFUND_CONVERT("/v1/pay/address/refundconvert", "POST"),
    ADDRESS_TRANSACTION_DETAIL("/v1/pay/address/transactiondetail", "GET"),
    PAY_CREATE_ORDER("/v1/pay/order", "POST"),
    PAY_ORDER_CLOSE("/v1/pay/order/close", "POST"),
    PAY_ORDER_QUERY("/v1/pay/order/query", "GET"),
    PAY_CREATE_REFUND("/v1/pay/order/refund", "POST"),
    PAY_QUERY_REFUND("/v1/pay/order/refund/query", "POST"),
    PAY_CREATE_BATCH_TRANSFER("/v1/pay/batch/transfer", "POST"),
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
