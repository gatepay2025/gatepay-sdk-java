package com.gatepay.core.api.channelmanage.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;


public class DeleteReq extends BaseRequest {

    @GatePayParam
    private String channelId;


    public DeleteReq() {
        this.api = GatePayApi.CHANNEL_MANAGE_DELETE;
    }


    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

}
