package com.gatepay.api.withdraw;

import com.gatepay.api.withdraw.model.response.CreateOrderResp;
import com.gatepay.api.withdraw.model.request.CreateOrderReq;
import com.gatepay.core.Client;
import com.gatepay.core.signature.Nonce;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiWithdraw {

    /**
     * 创建提现订单
     *
     * @param request
     * @return
     */
    public CreateOrderResp createOrder(CreateOrderReq request) {
        try {
            HttpRequest httpRequest = Client.generateHttpRequest(request, System.currentTimeMillis(), Nonce.generateNonce(9));
            HttpResponse<String> response = Client.generateHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new CreateOrderResp();
    }

}
