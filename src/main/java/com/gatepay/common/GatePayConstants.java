package com.gatepay.common;

public class GatePayConstants {

    // 请求地址相关
    public static final String DEFAULT_END_POINT = "http://dev.halftrust.xyz/gfpay";

    public static final String END_POINT_ADDRESS_CHAINS = "/v1/pay/address/chains";
    public static final String END_POINT_OPEN_SDK = "/v1/pay/open/sdk";


    public static final String SCHEME_HTTP = "http";
    public static final String SCHEME_HTTPS = "https";
    public static final String METHOD_GET = "GET";
    public static final String METHOD_PUT = "PUT";
    public static final String METHOD_POST = "POST";
    public static final String METHOD_DELETE = "DELETE";
    public static final String METHOD_PATCH = "PATCH";
    public static final String METHOD_HEAD = "HEAD";


    public static final String APPLICATION_JSON = "application/json";
    public static final String ACCEPT = "Accept";                 // Header 中的 Accept 字段
    public static final String CONTENT_TYPE = "Content-Type";     // Header 中的 ContentType 字段
    public static final String USER_AGENT = "User-Agent";


    public static final String VERSION = "0.0.1";                 // SDK 版本号
    public static final String USER_AGENT_FORMAT = "GatePay-SDK-Java/%s (%s) Java/%s"; // UserAgent中的信息

}
