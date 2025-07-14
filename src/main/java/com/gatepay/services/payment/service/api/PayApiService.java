package com.gatepay.services.payment.service.api;

import com.gatepay.payment.model.request.OperateOrderRequest;
import com.gatepay.payment.model.response.*;

public interface PayApiService {

    QueryOrderResponse getOrder(OperateOrderRequest request) throws Exception;

}