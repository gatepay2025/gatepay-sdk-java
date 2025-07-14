package com.gatepay.services.payment.api;

import com.gatepay.model.payment.request.OperateOrderRequest;
import com.gatepay.model.payment.response.QueryOrderResponse;

public interface PaymentApiService {

    QueryOrderResponse getOrder(OperateOrderRequest request) throws Exception;

}