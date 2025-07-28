/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model.resp;

import com.gatepay.common.BaseResponse;


/**
 * @Description 查询支持币种列表响应
 * @author ZJ-BE
 * @Date 2025/07/25
 */
public class CurrenciesResp extends BaseResponse<CurrenciesResp> {

    /**
     * 可选支付币种列表
     */
    private String[] currencies;

    public String[] getCurrencies() {
        return currencies;
    }

    public void setCurrencies(String[] currencies) {
        this.currencies = currencies;
    }

}
