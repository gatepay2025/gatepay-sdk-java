package com.gatepay.api.gift.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;

public class ListTempReq extends BaseRequest {

    public ListTempReq() {
        this.api = GatePayApi.GIFT_LIST_TEMPLATE;
    }

}
