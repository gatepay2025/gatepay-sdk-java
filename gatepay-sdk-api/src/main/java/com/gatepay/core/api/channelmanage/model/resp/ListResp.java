/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.channelmanage.model.resp;

import com.gatepay.core.api.channelmanage.model.MerchantChannel;
import com.gatepay.common.BaseResponse;

public class ListResp extends BaseResponse<ListResp> {

    private long total;
    private MerchantChannel[] merchantChannelList;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public MerchantChannel[] getMerchantChannelList() {
        return merchantChannelList;
    }

    public void setMerchantChannelList(MerchantChannel[] merchantChannelList) {
        this.merchantChannelList = merchantChannelList;
    }

}
