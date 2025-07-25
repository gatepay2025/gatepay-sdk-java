/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.convert.model.resp;

import com.gatepay.common.BaseResponse;

public class QueryCurrencyResp extends BaseResponse<QueryCurrencyResp> {

    private String[] currency;

    public String[] getCurrency() {
        return currency;
    }

    public void setCurrency(String[] currency) {
        this.currency = currency;
    }

}
