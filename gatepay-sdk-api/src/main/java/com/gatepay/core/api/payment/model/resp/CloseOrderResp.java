/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.payment.model.resp;

import com.gatepay.common.BaseResponse;

/**
 * @Description 关闭订单响应
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class CloseOrderResp extends BaseResponse<CloseOrderResp> {

    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
