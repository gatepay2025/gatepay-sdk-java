/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.common.model.resp;

import com.gatepay.common.BaseResponse;

/**
 * @Description GatePay客户端响应
 * @author zj-be
 * @Date 2025/07/25
 */
public class GatePayResp<Resp extends BaseResponse> extends BaseResponse {

    public GatePayResp(Resp resp) {
        super.setStatus(resp.getStatus());
        super.setCode(resp.getCode());
        super.setErrorMessage(resp.getErrorMessage());
        super.setLabel(resp.getLabel());
        super.setData(resp.getData());
    }

}
