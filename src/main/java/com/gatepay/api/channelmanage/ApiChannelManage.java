package com.gatepay.api.channelmanage;

import com.gatepay.api.BaseApi;
import com.gatepay.api.channelmanage.model.request.ListReq;
import com.gatepay.api.channelmanage.model.request.SaveReq;
import com.gatepay.api.channelmanage.model.request.UpdateReq;
import com.gatepay.api.channelmanage.model.response.ListResp;
import com.gatepay.api.channelmanage.model.response.SaveResp;
import com.gatepay.api.channelmanage.model.response.UpdateResp;

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

    /**
     * 查询客户渠道列表
     *
     */
    public ListResp list(ListReq request)  {
        try {
            return super.process(request, ListResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * 修改客户渠道
     *
     */
    public UpdateResp update(UpdateReq request) {
        try {
            return super.process(request, UpdateResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
