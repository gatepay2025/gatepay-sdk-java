package com.gatepay.common.model.resp;

import com.gatepay.common.BaseResponse;

public class GatePayResp<Resp extends BaseResponse> extends BaseResponse {

    public GatePayResp(Resp resp) {
        super.setStatus(resp.getStatus());
        super.setCode(resp.getCode());
        super.setErrorMessage(resp.getErrorMessage());
        super.setLabel(resp.getLabel());
        super.setData(resp.getData());
    }

}
