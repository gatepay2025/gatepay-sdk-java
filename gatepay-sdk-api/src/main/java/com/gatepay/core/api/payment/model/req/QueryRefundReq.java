/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.payment.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;

/**
 * @Description 查询退款请求
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class QueryRefundReq extends BaseRequest {

    /**
     * 退款请求ID
     */
    @GatePayParam
    private String refundRequestId;

    public QueryRefundReq() {
        this.api = GatePayApi.PAYMENT_QUERY_REFUND;
    }

    public String getRefundRequestId() {
        return refundRequestId;
    }

    public void setRefundRequestId(String refundRequestId) {
        this.refundRequestId = refundRequestId;
    }

}
