/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.checkout.model.resp;

import com.gatepay.common.BaseResponse;
import com.gatepay.common.model.Chain;

public class CreateOrderResp extends BaseResponse<CreateOrderResp> {

    private String prepayId;
    private String terminalType;
    private long expireTime;
    private String qrContent;
    private String location;
    private String payCurrency;
    private String payAmount;
    private Chain chain;
    private String appName;
    private String appLogo;
    private String goodsName;
    private String inUsdt;

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(long expireTime) {
        this.expireTime = expireTime;
    }

    public String getQrContent() {
        return qrContent;
    }

    public void setQrContent(String qrContent) {
        this.qrContent = qrContent;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPayCurrency() {
        return payCurrency;
    }

    public void setPayCurrency(String payCurrency) {
        this.payCurrency = payCurrency;
    }

    public String getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount;
    }

    public Chain getChain() {
        return chain;
    }

    public void setChain(Chain chain) {
        this.chain = chain;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppLogo() {
        return appLogo;
    }

    public void setAppLogo(String appLogo) {
        this.appLogo = appLogo;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getInUsdt() {
        return inUsdt;
    }

    public void setInUsdt(String inUsdt) {
        this.inUsdt = inUsdt;
    }

}
