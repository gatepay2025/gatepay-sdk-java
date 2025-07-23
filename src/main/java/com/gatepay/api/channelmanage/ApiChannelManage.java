package com.gatepay.api.channelmanage;

import com.gatepay.api.BaseApi;
import com.gatepay.api.channelmanage.model.req.DeleteReq;
import com.gatepay.api.channelmanage.model.req.ListReq;
import com.gatepay.api.channelmanage.model.req.SaveReq;
import com.gatepay.api.channelmanage.model.req.UpdateReq;
import com.gatepay.api.channelmanage.model.resp.DeleteResp;
import com.gatepay.api.channelmanage.model.resp.ListResp;
import com.gatepay.api.channelmanage.model.resp.SaveResp;
import com.gatepay.api.channelmanage.model.resp.UpdateResp;
import com.gatepay.core.GatePayConfig;

/**
 * 客户渠道管理接口
 *
 * @author ZJ-BE
 *
 */
public class ApiChannelManage extends BaseApi {

    public ApiChannelManage(GatePayConfig gatePayConfig) {
        super(gatePayConfig);
    }

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
