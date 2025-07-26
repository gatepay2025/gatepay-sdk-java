/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;

public class CurrenciesReq extends BaseRequest {

    public CurrenciesReq() {
        this.api = GatePayApi.ADDRESS_CURRENCIES;
    }

}
