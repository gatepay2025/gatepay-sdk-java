package com.gatepay.api.channelmanage;

import com.gatepay.api.BaseApi;
import com.gatepay.api.channelmanage.model.request.DeleteReq;
import com.gatepay.api.channelmanage.model.request.ListReq;
import com.gatepay.api.channelmanage.model.request.SaveReq;
import com.gatepay.api.channelmanage.model.request.UpdateReq;
import com.gatepay.api.channelmanage.model.response.DeleteResp;
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
        return super.process(request, SaveResp.class);
    }

    /**
     * 查询客户渠道列表
     *
     */
    public ListResp list(ListReq request)  {
        return super.process(request, ListResp.class);
    }

    /**
     * 修改客户渠道
     *
     */
    public UpdateResp update(UpdateReq request) {
        return super.process(request, UpdateResp.class);
    }

    /**
     * 删除客户渠道
     *
     */
    public DeleteResp delete(DeleteReq request)  {
        return super.process(request, DeleteResp.class);
    }

}
