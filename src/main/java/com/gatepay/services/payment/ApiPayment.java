package com.gatepay.services.payment;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gatepay.core.signature.Head;
import com.gatepay.core.signature.Signer;
import com.gatepay.model.payment.request.OperateOrderRequest;
import com.gatepay.model.payment.response.QueryOrderResponse;

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
            String signature = Signer.verifySignature();

            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create("baseUrl" + "/api/v1/payment/query"))
                    .header("Content-Type", "application/json")
                    .header(Head.HEADER_GATEPAY_API_KEY, "apiKey")
                    .header(Head.HEADER_GATEPAY_CLIENT_ID, "clientId")
                    .header(Head.HEADER_GATE_MERCHANT_ID, "merchantId")
                    .header(Head.HEADER_GATEPAY_TIMESTAMP, "timestamp")
                    .header(Head.HEADER_GATEPAY_NONCE, "nonce")
                    .header(Head.HEADER_GATEPAY_SIGNATURE, signature)
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

