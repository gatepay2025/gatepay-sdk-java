package com.gatepay.api.address;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.gatepay.api.BaseApi;
import com.gatepay.api.address.model.request.*;
import com.gatepay.api.address.model.response.*;
import com.gatepay.core.GatePayConfig;


/**
 * 地址支付接口
 *
 */
public class ApiAddress extends BaseApi {

    public ApiAddress(GatePayConfig gatePayConfig) {
        super(gatePayConfig);
    }


    /**
     * 查询支持链列表
     *
     * @param request
     * @return
     */
    public ChainsResp getAddressChains(ChainsReq request) {
        return super.process(request, ChainsResp.class);
    }


    /**
     * 查询支持币种列表
     *
     * @return
     */
    public CurrenciesResp getAddressCurrencies() {
        return super.process(new CurrenciesReq(), CurrenciesResp.class);
    }


    /**
     * 创建闪兑地址支付单之前，根据订单币种查询支持闪兑的币种，用户从支持闪兑的币种列表中选择实际支付币种创建闪兑支付订单
     *
     * @param request
     * currency 订单币种
     *
     * @return
     * currencies 支持闪兑到订单币种的币种列表
     */
    public SupportedConvertCurrenciesResp getSupportedConvertCurrencies(SupportedConvertCurrenciesReq request) {
        return super.process(request, SupportedConvertCurrenciesResp.class);
    }


    /**
     *
     * 创建地址支付订单/下单
     *
     */
    public CreateOrderResp createOrder(CreateOrderReq request) {
        return super.process(request, CreateOrderResp.class);
    }


    /**
     * 查询地址支付订单详情
     *
     * @param request
     * @return
     */
    public QueryOrderResp queryOrder(QueryOrderReq request) {
        return super.process(request, QueryOrderResp.class);
    }



    /**
     * 创建非闪兑支付单退款
     *
     */
    public CreateRefundResp createRefund(CreateRefundReq request) {
        return super.process(request, CreateRefundResp.class);
    }


    /**
     * 创建闪兑支付单退款
     *
     * @param request
     * @return
     * @throws JsonProcessingException
     */
    public CreateRefundConvertResp createRefundConvert(CreateRefundConvertReq request) {
        return super.process(request, CreateRefundConvertResp.class);
    }


    /**
     * 查询链上交易详情
     *
     * @param request
     * @return
     */
    public TransactionDetailResp transactionDetail(TransactionDetailReq request) {
        return super.process(request, TransactionDetailResp.class);
    }

}
