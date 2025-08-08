/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.common;

/**
 * @Description 常量类
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class GatePayConstants {

    // 请求地址相关
    public static final String END_POINT_DEFAULT = "";
    public static final String END_POINT_OPEN_PLATFORM = "";


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
