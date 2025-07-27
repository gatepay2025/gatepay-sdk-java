/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.payment.model.resp;

import com.gatepay.common.BaseResponse;

/**
 * @Description 创建订单响应
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class CreateOrderResp extends BaseResponse<CreateOrderResp> {

    private String prepayId;
    private String terminalType;
    private long expireTime;

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

}
