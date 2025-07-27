/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.withdraw.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;

/**
 * @Description 查询余额请求
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class QueryBalanceReq extends BaseRequest {

    /**
     * 币种
     */
    private String currency;


    public QueryBalanceReq() {
        this.api = GatePayApi.WITHDRAW_QUERY_BALANCE;
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
