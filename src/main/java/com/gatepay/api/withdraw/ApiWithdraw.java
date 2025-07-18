package com.gatepay.api.withdraw;

import com.gatepay.api.BaseApi;
import com.gatepay.api.withdraw.model.request.*;
import com.gatepay.api.withdraw.model.response.*;


public class ApiWithdraw extends BaseApi {

    /**
     * 创建提现订单
     *
     * @param request
     * @return
     */
    public CreateOrderResp createOrder(CreateOrderReq request) {
        try {
            return super.process(request, CreateOrderResp.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 查询提现订单
     *
     * detail_status:
     * ALL 全部子订单
     * PENDING 待处理子订单
     * PROCESSING 已提交提现请求，待确认子订单
     * CHECK 审核中子订单
     * FAIL 失败子订单
     * DONE 提现成功子订单
     */
    public QueryOrderResp queryOrder(QueryOrderReq request) {
        try {
            return super.process(request, QueryOrderResp.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 查询币种支持的链
     *
     */
    public QueryChainsResp queryChains(QueryChainsReq request) {
        try {
            super.process(request, QueryChainsResp.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 查询个人账户余额
     *
     */
    public QueryBalanceResp queryBalance(QueryBalanceReq request) {
        try {
            super.process(request, QueryBalanceResp.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 查询提现状态
     *
     */
    public QueryStatusResp queryStatus(QueryStatusReq request) {
        try {
            return super.process(request, QueryStatusResp.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
