/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.withdraw.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;

/**
 * @Description 查询状态请求
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class QueryStatusReq extends BaseRequest {

    /**
     * 币种
     */
    @GatePayParam
    private String currency;


    public QueryStatusReq() {
        this.api = GatePayApi.WITHDRAW_QUERY_STATUS;
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
