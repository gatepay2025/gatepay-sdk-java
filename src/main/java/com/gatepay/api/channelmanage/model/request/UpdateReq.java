package com.gatepay.api.channelmanage.model.request;

import com.gatepay.api.channelmanage.model.MerchantChannel;
import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;

public class UpdateReq extends BaseRequest {

    private MerchantChannel[] merchantChannelList;


    public UpdateReq() {
        this.api = GatePayApi.CHANNEL_MANAGE_UPDATE;
    }


    public MerchantChannel[] getMerchantChannelList() {
        return merchantChannelList;
    }

    public void setMerchantChannelList(MerchantChannel[] merchantChannelList) {
        this.merchantChannelList = merchantChannelList;
    }

}
