/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;

/**
 * @Description 查询支付单请求
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class QueryOrderReq extends BaseRequest {

    /**
     * 地址支付预支付单id
     */
    @GatePayParam
    private String prepayId;

    /**
     * 商户系统交易号
     */
    @GatePayParam
    private String merchantTradeNo;


    public QueryOrderReq() {
        this.api = GatePayApi.ADDRESS_QUERY_ORDER;
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
