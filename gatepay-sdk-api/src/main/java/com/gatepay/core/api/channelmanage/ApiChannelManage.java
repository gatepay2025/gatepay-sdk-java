/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.channelmanage;

import com.gatepay.core.api.BaseApi;
import com.gatepay.core.api.channelmanage.model.req.DeleteReq;
import com.gatepay.core.api.channelmanage.model.req.ListReq;
import com.gatepay.core.api.channelmanage.model.req.SaveReq;
import com.gatepay.core.api.channelmanage.model.req.UpdateReq;
import com.gatepay.core.api.channelmanage.model.resp.DeleteResp;
import com.gatepay.core.api.channelmanage.model.resp.ListResp;
import com.gatepay.core.api.channelmanage.model.resp.SaveResp;
import com.gatepay.core.api.channelmanage.model.resp.UpdateResp;
import com.gatepay.infrastructure.GatePayConfig;

/**
 * @Description 客户渠道管理接口
 * @author ZJ-BE
 * @Date 2025/07/25
 */
public class ApiChannelManage extends BaseApi {

    public ApiChannelManage(GatePayConfig gatePayConfig) {
        super(gatePayConfig);
    }

    /**
     * 新增客户渠道
     * @param request
     * @return
     */
    public SaveResp save(SaveReq request) {
        return super.process(request, SaveResp.class);
    }

    /**
     * 查询客户渠道列表
     * @param request
     * @return
     */
    public ListResp list(ListReq request)  {
        return super.process(request, ListResp.class);
    }

    /**
     * 修改客户渠道
     * @param request
     * @return
     */
    public UpdateResp update(UpdateReq request) {
        return super.process(request, UpdateResp.class);
    }

    /**
     * 删除客户渠道
     * @param request
     * @return
     */
    public DeleteResp delete(DeleteReq request)  {
        return super.process(request, DeleteResp.class);
    }

}
