/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;

/**
 * @Description 查询交易详情请求
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class TransactionDetailReq extends BaseRequest {

    /**
     * 地址支付预支付单id
     */
    @GatePayParam
    private String prepayId;

    public TransactionDetailReq() {
        this.api = GatePayApi.ADDRESS_TRANSACTION_DETAIL;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

}
