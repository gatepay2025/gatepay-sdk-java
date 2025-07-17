package com.gatepay.service;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.BaseResponse;
import com.gatepay.core.Client;
import com.gatepay.core.signature.Nonce;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BaseService {

    protected <Req extends BaseRequest, Resp extends BaseResponse> Resp process(Req req, Class<Resp> respClass) {
        try {
            HttpRequest httpRequest = Client.generateHttpRequest(req, System.currentTimeMillis(), Nonce.generateNonce(9));
            HttpResponse<String> httpResponse = Client.generateHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(httpResponse.body().toString());
            return respClass.newInstance();
        } catch (Exception e) {

        }
        return null;
    }

}
