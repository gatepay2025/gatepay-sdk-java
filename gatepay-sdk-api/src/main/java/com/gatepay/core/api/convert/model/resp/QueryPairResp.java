/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.convert.model.resp;

import com.gatepay.common.BaseResponse;

/**
 * @Description 查询可用币种对响应
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class QueryPairResp extends BaseResponse<QueryPairResp[]> {

    private String pair;
    private String sellCurrency;
    private String sellCurrencyMax;
    private String sellCurrencyMin;
    private String buyCurrency;
    private String buyCurrencyMax;
    private String buyCurrencyMin;

    public String getPair() {
        return pair;
    }

    public void setPair(String pair) {
        this.pair = pair;
    }

    public String getSellCurrency() {
        return sellCurrency;
    }

    public void setSellCurrency(String sellCurrency) {
        this.sellCurrency = sellCurrency;
    }

    public String getSellCurrencyMax() {
        return sellCurrencyMax;
    }

    public void setSellCurrencyMax(String sellCurrencyMax) {
        this.sellCurrencyMax = sellCurrencyMax;
    }

    public String getSellCurrencyMin() {
        return sellCurrencyMin;
    }

    public void setSellCurrencyMin(String sellCurrencyMin) {
        this.sellCurrencyMin = sellCurrencyMin;
    }

    public String getBuyCurrency() {
        return buyCurrency;
    }

    public void setBuyCurrency(String buyCurrency) {
        this.buyCurrency = buyCurrency;
    }

    public String getBuyCurrencyMax() {
        return buyCurrencyMax;
    }

    public void setBuyCurrencyMax(String buyCurrencyMax) {
        this.buyCurrencyMax = buyCurrencyMax;
    }

    public String getBuyCurrencyMin() {
        return buyCurrencyMin;
    }

    public void setBuyCurrencyMin(String buyCurrencyMin) {
        this.buyCurrencyMin = buyCurrencyMin;
    }

}
