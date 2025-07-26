/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.convert.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;

public class QueryCurrencyReq extends BaseRequest {

    private String side;


    public QueryCurrencyReq() {
        this.api = GatePayApi.CONVERT_CURRENCY;
    }


    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

}
