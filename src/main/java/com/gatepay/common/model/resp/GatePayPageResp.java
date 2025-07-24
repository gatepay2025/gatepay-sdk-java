package com.gatepay.common.model.resp;

import com.gatepay.common.BasePageResponse;

public class GatePayPageResp<Resp extends BasePageResponse> extends BasePageResponse {

    public GatePayPageResp(Resp resp) {
        super.setPage(resp.getPage());
        super.setPageSize(resp.getPageSize());
        super.setPageCount(resp.getPageCount());
        super.setTotalCount(resp.getTotalCount());
        super.setMessage(resp.getMessage());
        super.setData(resp.getData());
    }

}
