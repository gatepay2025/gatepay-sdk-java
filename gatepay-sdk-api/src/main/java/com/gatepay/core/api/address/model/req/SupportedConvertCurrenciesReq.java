/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;


public class SupportedConvertCurrenciesReq extends BaseRequest {

    @GatePayParam
    private String currency;

    public SupportedConvertCurrenciesReq() {
        this.api = GatePayApi.ADDRESS_SUPPORTED_CONVERT_CURRENCIES;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
