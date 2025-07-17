package com.gatepay.common.enums;


public enum GatePayApi {

    ADDRESS_CHAINS("/v1/pay/address/chains", "GET"),
    ADDRESS_CURRENCIES("/v1/pay/address/currencies", "GET"),
    ADDRESS_SUPPORTED_CONVERT_CURRENCIES("/v1/pay/address/supportedconvertcurrencies", "GET"),
    ADDRESS_CREATE_ORDER("/v1/pay/address/create", "POST"),
    ADDRESS_QUERY_ORDER("/v1/pay/address/query", "GET");


    private String url;
    private String httpMethod;


    GatePayApi(String url, String httpMethod) {
        this.url = url;
        this.httpMethod = httpMethod;
    }

}
