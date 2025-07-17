package com.gatepay.api.channelmanage;

import com.gatepay.api.BaseApi;
import com.gatepay.api.channelmanage.model.request.SaveReq;
import com.gatepay.api.channelmanage.model.response.SaveResp;

/**
 * 客户渠道管理接口
 *
 * @author ZJ-BE
 *
 */
public class ApiChannelManage extends BaseApi {

    /**
     * 新增客户渠道
     *
     */
    public SaveResp save(SaveReq request) {
        try {
            return super.process(request, SaveResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
