/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.bill.model.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;

/**
 * @Description 查询订单请求
 * @Author ZJ-BE
 * @Date 2025/7/25
 */
public class QueryOrdersReq extends BaseRequest {

    @GatePayParam
    private long startTime;

    @GatePayParam
    private long endTime;

    @GatePayParam
    private long page;

    @GatePayParam
    private long count;

    @GatePayParam(required = false)
    private String currency;

    @GatePayParam(required = false)
    private String orderType;

    @GatePayParam(required = false)
    private String orderIdNo;

    @JsonProperty("financial_type")
    @GatePayParam(required = false)
    private String financialType;


    public QueryOrdersReq() {
        this.api = GatePayApi.BILL_QUERY_ORDERS;
    }


    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderIdNo() {
        return orderIdNo;
    }

    public void setOrderIdNo(String orderIdNo) {
        this.orderIdNo = orderIdNo;
    }

    public String getFinancialType() {
        return financialType;
    }

    public void setFinancialType(String financialType) {
        this.financialType = financialType;
    }

}
