/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.convert.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;

/**
 * @Description 查询可用币种对请求
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class QueryPairReq extends BaseRequest {

    @GatePayParam
    private String currency;

    @GatePayParam
    private String side;


    public QueryPairReq() {
        this.api = GatePayApi.CONVERT_PAIR;
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

}
