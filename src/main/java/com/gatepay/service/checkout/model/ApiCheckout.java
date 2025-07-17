package com.gatepay.service.checkout.model;

import com.gatepay.core.Client;
import com.gatepay.core.signature.Nonce;
import com.gatepay.service.checkout.model.request.CreateOrderReq;
import com.gatepay.service.checkout.model.response.CreateOrderResp;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * 收银台支付接口
 *
 * @author ZJ-BE
 *
 */
public class ApiCheckout {

    public CreateOrderResp createOrder(CreateOrderReq request) {
        try {
            HttpRequest httpRequest = Client.generateHttpRequest(request, System.currentTimeMillis(), Nonce.generateNonce(9));
            HttpResponse<String> response = Client.generateHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body().toString());
        } catch (Exception e) {

        }
    }

}
