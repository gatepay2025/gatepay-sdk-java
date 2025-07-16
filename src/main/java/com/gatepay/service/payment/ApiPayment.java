package com.gatepay.service.payment;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gatepay.common.GatePayConstants;
import com.gatepay.core.signature.Signer;
import com.gatepay.service.payment.model.request.OperateOrderRequest;
import com.gatepay.service.payment.model.response.QueryOrderResponse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ApiPayment {

    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    public ApiPayment(HttpClient httpClient, ObjectMapper objectMapper) {
        this.httpClient = httpClient;
        this.objectMapper = objectMapper;
    }


    public QueryOrderResponse getOrder(OperateOrderRequest request) throws Exception {
        try {
            String requestBody = objectMapper.writeValueAsString(request);
            String signature = Signer.verifySignature("", "", "", "");

            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create("baseUrl" + "/api/v1/payment/query"))
                    .header("Content-Type", "application/json")
                    .header(GatePayConstants.HEADER_GATEPAY_API_KEY, "apiKey")
                    .header(GatePayConstants.HEADER_GATEPAY_CLIENT_ID, "clientId")
                    .header(GatePayConstants.HEADER_GATE_MERCHANT_ID, "merchantId")
                    .header(GatePayConstants.HEADER_GATEPAY_TIMESTAMP, "timestamp")
                    .header(GatePayConstants.HEADER_GATEPAY_NONCE, "nonce")
                    .header(GatePayConstants.HEADER_GATEPAY_SIGNATURE, signature)
                    .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                    .build();

            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                return objectMapper.readValue(response.body(), QueryOrderResponse.class);
            } else {
                throw new RuntimeException("API request failed with status code: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error executing API request", e);
        }
    }

}

