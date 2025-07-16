package com.gatepay.common;

public class GatePayConstants {

    // 请求地址相关
    public static final String END_POINT_DEFAULT = "http://dev.halftrust.xyz/gfpay";
    public static final String END_POINT_ADDRESS_CHAINS = "/v1/pay/address/chains";
    public static final String END_POINT_ADDRESS_CURRENCIES = "/v1/pay/address/currencies";
    public static final String END_POINT_ADDRESS_SUPPORTED_CONVERT_CURRENCIES = "/v1/pay/address/supportedconvertcurrencies";
    public static final String END_POINT_ADDRESS_CREATE_ORDER = "/v1/pay/address/create";
    public static final String END_POINT_ADDRESS_QUERY_ORDER = "/v1/pay/address/query";
    public static final String END_POINT_ADDRESS_CREATE_REFUND = "/v1/pay/address/refund";
    public static final String END_POINT_ADDRESS_CREATE_REFUND_CONVERT = "/v1/pay/address/refundconvert";
    public static final String END_POINT_ADDRESS_TRANSACTION_DETAIL = "/v1/pay/address/transactiondetail";

    // web 相关
    public static final String END_POINT_PAY_ORDER = "/v1/pay/order";
    public static final String END_POINT_PAY_ORDER_CLOSE = "/v1/pay/order/close";
    public static final String END_POINT_PAY_ORDER_QUERY = "/v1/pay/order/query";







    public static final String END_POINT_OPEN_SDK = "/v1/pay/open/sdk";

    // 请求方法相关
    public static final String SCHEME_HTTP = "http";
    public static final String SCHEME_HTTPS = "https";
    public static final String METHOD_GET = "GET";
    public static final String METHOD_PUT = "PUT";
    public static final String METHOD_POST = "POST";
    public static final String METHOD_DELETE = "DELETE";
    public static final String METHOD_PATCH = "PATCH";
    public static final String METHOD_HEAD = "HEAD";



    // 请求头相关
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HEADER_APPLICATION_JSON = "application/json";
    public static final String HEADER_ACCEPT = "Accept";                 // Header 中的 Accept 字段
    public static final String HEADER_USER_AGENT = "User-Agent";



    public static final String HEADER_GATEPAY_API_KEY = "X-GatePay-Certificate-SN";
    public static final String HEADER_GATEPAY_CERTIFICATE_CLIENT_ID = "X-GatePay-Certificate-ClientId";
    public static final String HEADER_GATEPAY_TIMESTAMP = "X-GatePay-Timestamp";
    public static final String HEADER_GATEPAY_NONCE = "X-GatePay-Nonce";
    public static final String HEADER_GATEPAY_SIGNATURE = "X-GatePay-Signature";
    public static final String HEADER_GATE_CHANNEL_ID = "X-GatePay-ChannelId";
    public static final String HEADER_GATE_CLIENT_ID = "X-GatePay-ClientId";
















    public static final String VERSION = "0.0.1";                 // SDK 版本号
    public static final String USER_AGENT_FORMAT = "GatePay-SDK-Java/%s (%s) Java/%s"; // UserAgent中的信息

}
