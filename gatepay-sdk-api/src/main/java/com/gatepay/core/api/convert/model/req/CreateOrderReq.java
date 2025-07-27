/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.convert.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;

/**
 * @Description 创建订单请求
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class CreateOrderReq extends BaseRequest {

    @GatePayParam
    private String clientReqId;

    @GatePayParam
    private String quoteId;

    @GatePayParam
    private String sellCurrency;

    @GatePayParam
    private String sellAmount;

    @GatePayParam
    private String buyCurrency;

    @GatePayParam
    private String buyAmount;

    @GatePayParam
    private String price;


    public CreateOrderReq() {
        this.api = GatePayApi.CONVERT_CREATE_ORDER;
    }


    public String getClientReqId() {
        return clientReqId;
    }

    public void setClientReqId(String clientReqId) {
        this.clientReqId = clientReqId;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    public String getSellCurrency() {
        return sellCurrency;
    }

    public void setSellCurrency(String sellCurrency) {
        this.sellCurrency = sellCurrency;
    }

    public String getSellAmount() {
        return sellAmount;
    }

    public void setSellAmount(String sellAmount) {
        this.sellAmount = sellAmount;
    }

    public String getBuyCurrency() {
        return buyCurrency;
    }

    public void setBuyCurrency(String buyCurrency) {
        this.buyCurrency = buyCurrency;
    }

    public String getBuyAmount() {
        return buyAmount;
    }

    public void setBuyAmount(String buyAmount) {
        this.buyAmount = buyAmount;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
