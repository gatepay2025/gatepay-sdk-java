package com.gatepay.core.api.payment.model.resp;

import com.gatepay.common.BaseResponse;

public class CloseOrderResp extends BaseResponse<CloseOrderResp> {

    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
