/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model.resp;

import com.gatepay.common.BaseResponse;


/**
 * @Description 支持的闪兑币种响应
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class SupportedConvertCurrenciesResp extends BaseResponse<SupportedConvertCurrenciesResp> {

    /**
     * 支持的闪兑币种
     */
    private String[] currencies;


    public String[] getCurrencies() {
        return currencies;
    }

    public void setCurrencies(String[] currencies) {
        this.currencies = currencies;
    }

}
