/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.convert.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;

/**
 * @Description 查询订单请求
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class QueryOrderReq extends BaseRequest {

    /**
     * 订单id
     */
    @GatePayParam
    private String orderId;


    public QueryOrderReq() {
        this.api = GatePayApi.CONVERT_QUERY_ORDER;
    }


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

}
