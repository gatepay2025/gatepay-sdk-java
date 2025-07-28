/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;

/**
 * @Description 创建非闪兑支付单退款请求
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class CreateRefundReq extends BaseRequest {

    /**
     * 商户请求退款编号
     */
    @GatePayParam
    private String refundRequestId;

    /**
     * 对应支付单订单id
     */
    @GatePayParam
    private String prepayId;

    /**
     * 退款金额
     */
    @GatePayParam
    private String refundAmount;

    /**
     * 退款原因
     */
    private String refundReason;

    /**
     * 地址支付退款接收人在gate系统的user_id
     */
    @GatePayParam
    private long receiverId;


    public CreateRefundReq() {
        this.api = GatePayApi.ADDRESS_CREATE_REFUND;
    }


    public String getRefundRequestId() {
        return refundRequestId;
    }

    public void setRefundRequestId(String refundRequestId) {
        this.refundRequestId = refundRequestId;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

}
