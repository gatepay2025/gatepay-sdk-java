package com.gatepay.api.channelmanage.model.request;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;


public class ListReq extends BaseRequest {

    @GatePayParam
    private String channelId;

    @GatePayParam
    private String desc;

    @GatePayParam
    private String channelType;

    @GatePayParam
    private long page;

    @GatePayParam
    private long count;

    public ListReq() {
        this.api = GatePayApi.CHANNEL_MANAGE_LIST;
    }


    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

}
