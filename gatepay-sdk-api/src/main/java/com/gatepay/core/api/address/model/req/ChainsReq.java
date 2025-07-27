/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;

/**
 * @Description 查询支持链列表请求
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class ChainsReq extends BaseRequest {

    /**
     * 币种
     */
    @GatePayParam
    private String currency;

    public ChainsReq() {
        this.api = GatePayApi.ADDRESS_CHAINS;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
