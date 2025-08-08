/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.payment.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;

/**
 * @Description 查询订单请求
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class QueryOrderReq extends BaseRequest {

    private String prepayId;
    private String merchantTradeNo;


    public QueryOrderReq() {
        this.api = GatePayApi.PAYMENT_QUERY_ORDER;
    }


    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getMerchantTradeNo() {
        return merchantTradeNo;
    }

    public void setMerchantTradeNo(String merchantTradeNo) {
        this.merchantTradeNo = merchantTradeNo;
    }

}
