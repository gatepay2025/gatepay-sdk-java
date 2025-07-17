package com.gatepay.service.address;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gatepay.common.BaseRequest;
import com.gatepay.common.GatePayConstants;
import com.gatepay.core.Client;
import com.gatepay.core.signature.Nonce;
import com.gatepay.core.signature.Signer;
import com.gatepay.service.address.model.request.*;
import com.gatepay.service.address.model.response.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;


/**
 *
 */
public class ApiAddress {

    private final String apiKey;
    private final ObjectMapper objectMapper;


    public ApiAddress(String apiKey) {
        this.apiKey = apiKey;
        this.objectMapper = new ObjectMapper();
    }




    /**
     * 查询支持链列表
     *
     * @param request
     * @return
     */
    public ChainsResp getAddressChains(ChainsReq request) {
        String queryString = ""; // buildQueryStrByGet(null);
        try {
            HttpRequest httpRequest = Client.generateHttpRequest(request, System.currentTimeMillis(), Nonce.generateNonce(9), queryString);
            HttpResponse<String> response = Client.generateHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 解析响应
        return new ChainsResp();
    }


    /**
     *
     * @return
     */
    public CurrenciesResp getAddressCurrencies() {
        String queryString = "";  // buildQueryString(null);
        try {
            HttpRequest httpRequest = Client.generateHttpRequest(new CurrenciesReq(), System.currentTimeMillis(), Nonce.generateNonce(9), queryString);
            HttpResponse<String> response = Client.generateHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new CurrenciesResp();
    }



    /**
     * 创建闪兑地址支付单之前，根据订单币种查询支持闪兑的币种，用户从支持闪兑的币种列表中选择实际支付币种创建闪兑支付订单
     *
     * @param request
     * currency 订单币种
     *
     * @return
     * currencies 支持闪兑到订单币种的币种列表
     */
    public SupportedConvertCurrenciesResp getSupportedConvertCurrencies(SupportedConvertCurrenciesReq request) {
        String queryString = "";  // buildQueryString(null);
        try {
            HttpRequest httpRequest = Client.generateHttpRequest(request, System.currentTimeMillis(), Nonce.generateNonce(9), queryString);
            HttpResponse<String> response = Client.generateHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new SupportedConvertCurrenciesResp();
    }


    /**
     *
     * 创建地址支付订单/下单
     *
     */
    public CreateOrderResp createOrder(CreateOrderReq request) throws JsonProcessingException {
        // 构建请求URL
        String queryString = objectMapper.writeValueAsString(request);  // buildQueryString(null);
        String secretKey = "Mz6M_q4AkDnZCSoTDo03A6OtWzN5ut8_Uix3jyVjxAU=";

        // 构建请求头
        long timestamp = 1752742852L;// System.currentTimeMillis();
        String signature = Signer.verifySignature(String.valueOf(timestamp), "1234567890", queryString, secretKey);

        // 发送请求
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(request.getRequestUrl()))
                .header(GatePayConstants.HEADER_CONTENT_TYPE, "application/json")
                .header(GatePayConstants.HEADER_GATEPAY_TIMESTAMP, String.valueOf(timestamp))
                .header(GatePayConstants.HEADER_GATEPAY_NONCE, "1234567890")
                .header(GatePayConstants.HEADER_GATEPAY_SIGNATURE, signature)
                .header(GatePayConstants.HEADER_GATEPAY_CERTIFICATE_CLIENT_ID, "mZ96D37oKk-HrWJc")   // apiKey)
                .POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .build();
        try {
            HttpResponse<String> response = Client.generateHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 解析响应
        return new CreateOrderResp();
    }


    /**
     * 查询地址支付订单详情
     *
     * @param request
     * @return
     */
    public QueryOrderResp queryOrder(QueryOrderReq request) {
        String queryString = "";  //
        try {
            HttpRequest httpRequest = Client.generateHttpRequest(request, System.currentTimeMillis(), Nonce.generateNonce(9), queryString);
            HttpResponse<String> response = Client.generateHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 解析响应
        return new QueryOrderResp();
    }



    /**
     * 创建非闪兑支付单退款
     *
     */
    public CreateRefundResp createRefund(CreateRefundReq request) throws JsonProcessingException {
        // 构建请求URL
        String secretKey = "Mz6M_q4AkDnZCSoTDo03A6OtWzN5ut8_Uix3jyVjxAU=";

        // 构建请求头
        long timestamp = System.currentTimeMillis();

        String queryString = objectMapper.writeValueAsString(request);
        String signature = Signer.verifySignature(String.valueOf(timestamp), "1234567890", queryString, secretKey);

        // 发送请求
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(request.getRequestUrl()))
                .header(GatePayConstants.HEADER_CONTENT_TYPE, "application/json")
                .header(GatePayConstants.HEADER_GATEPAY_TIMESTAMP, String.valueOf(timestamp))
                .header(GatePayConstants.HEADER_GATEPAY_NONCE, "1234567890")
                .header(GatePayConstants.HEADER_GATEPAY_SIGNATURE, signature)
                .header(GatePayConstants.HEADER_GATEPAY_CERTIFICATE_CLIENT_ID, "mZ96D37oKk-HrWJc")   // apiKey)
                .POST(HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(request)))
                .build();
        try {
            HttpResponse<String> response = Client.generateHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 解析响应
        return new CreateRefundResp();
    }


    /**
     * 创建闪兑支付单退款
     *
     * @param request
     * @return
     * @throws JsonProcessingException
     */
    public CreateRefundConvertResp createRefundConvert(CreateRefundConvertReq request) throws IOException, InterruptedException {
        // 构建请求URL
        String secretKey = "Mz6M_q4AkDnZCSoTDo03A6OtWzN5ut8_Uix3jyVjxAU=";

        // 构建请求头
        // long timestamp = System.currentTimeMillis();

        String requestBody = objectMapper.writeValueAsString(request);
        // String signature = Signer.verifySignature(String.valueOf(timestamp), "1234567890", queryString, secretKey);

        String timestamp = String.valueOf(Instant.now().getEpochSecond());
        String nonce = Nonce.generateNonce(32);

        // Generate signature
        String signature = Signer.generateSignature(timestamp, nonce, requestBody, secretKey);

        HttpRequest.Builder requestBuilder = HttpRequest.newBuilder()
                .uri(URI.create(request.getRequestUrl()))
                .timeout(Duration.ofSeconds(10))
                .header("Content-Type", "application/json")
                .header("X-Gate-Pay-Api-Key", apiKey)
                .header("X-Gate-Pay-Client-Id", "mZ96D37oKk-HrWJc")
                .header(GatePayConstants.HEADER_GATEPAY_TIMESTAMP, timestamp)
                .header(GatePayConstants.HEADER_GATEPAY_NONCE, nonce)
                .header(GatePayConstants.HEADER_GATEPAY_SIGNATURE, signature);
        if (request instanceof BaseRequest) {
            Map<String, String> headers = ((BaseRequest) request).getHeaders();
            if (headers != null) {
                headers.forEach(requestBuilder::header);
            }
        }
        requestBuilder.method("POST", HttpRequest.BodyPublishers.ofString(requestBody));

        try {
            HttpResponse<String> response = Client.generateHttpClient().send(
                    requestBuilder.build(),
                    HttpResponse.BodyHandlers.ofString()
            );
            System.out.println(response.body().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new CreateRefundConvertResp();
    }


    /**
     * 查询链上交易详情
     *
     * @param request
     * @return
     */
    public TransactionDetailResp transactionDetail(TransactionDetailReq request) {
        String queryString = "";  // buildQueryString(null);
        try {
            HttpRequest httpRequest = Client.generateHttpRequest(request, System.currentTimeMillis(), Nonce.generateNonce(9), queryString);
            HttpResponse<String> response = Client.generateHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new TransactionDetailResp();
    }




    /**
     * 构建查询字符串
     *
     * @param params 参数映射
     * @return 查询字符串
     */
    private String buildQueryStr(Map<String, String> params) {
        if (params.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(entry.getKey()).append("=").append(entry.getValue());
        }
        return sb.toString();
    }

}
