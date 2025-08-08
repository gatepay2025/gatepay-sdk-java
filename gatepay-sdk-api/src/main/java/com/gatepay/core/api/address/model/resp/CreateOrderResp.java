/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model.resp;

import com.gatepay.common.BaseResponse;
import com.gatepay.common.model.Chain;

/**
 * @Description 创建订单响应
 * @author ZJ-BE
 * @Date 2025/07/25
 */
public class CreateOrderResp extends BaseResponse<CreateOrderResp> {

    /**
     * 创建的支付单order id
     */
    private String prepayId;

    /**
     * 创建订单的终端类型
     */
    private String terminalType;

    /**
     * 过期毫秒时间戳
     */
    private long expireTime;

    /**
     * 地址支付支付单绑定的链和地址
     */
    private Chain chain;


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

    public Chain getChain() {
        return chain;
    }

    public void setChain(Chain chain) {
        this.chain = chain;
    }

}
