/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.convert.model.resp;

import com.gatepay.common.BaseResponse;


/**
 * @Description 查询可用闪兑币种
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class QueryCurrencyResp extends BaseResponse<QueryCurrencyResp> {

    /**
     * 币种列表
     */
    private String[] currency;

    public String[] getCurrency() {
        return currency;
    }

    public void setCurrency(String[] currency) {
        this.currency = currency;
    }

}
