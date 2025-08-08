/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.channelmanage.model.req;

import com.gatepay.core.api.channelmanage.model.MerchantChannel;
import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;


public class SaveReq extends BaseRequest {

    private MerchantChannel[] merchantChannelList;

    public SaveReq() {
        this.api = GatePayApi.CHANNEL_MANAGE_SAVE;
    }

    public MerchantChannel[] getMerchantChannelList() {
        return merchantChannelList;
    }

    public void setMerchantChannelList(MerchantChannel[] merchantChannelList) {
        this.merchantChannelList = merchantChannelList;
    }

}
