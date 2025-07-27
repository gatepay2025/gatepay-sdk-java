/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.payment.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;

/**
 * @Description 查询余额请求
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class QueryBalanceReq extends BaseRequest {

    public QueryBalanceReq() {
        this.api = GatePayApi.PAYMENT_QUERY_BALANCE;
    }

}
