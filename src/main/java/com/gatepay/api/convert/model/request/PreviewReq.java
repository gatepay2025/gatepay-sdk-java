package com.gatepay.api.convert.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;

public class PreviewReq extends BaseRequest {

    private String buyCurrency;
    private String buyAmount;
    private String sellCurrency;
    private String sellAmount;


    public PreviewReq() {
        this.api = GatePayApi.CONVERT_PREVIEW;
    }

}
