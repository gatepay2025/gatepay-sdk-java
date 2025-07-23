package com.gatepay.core;

import com.gatepay.api.address.ApiAddress;
import com.gatepay.api.address.model.req.*;
import com.gatepay.api.address.model.resp.*;
import com.gatepay.api.bill.ApiBill;
import com.gatepay.api.bill.model.req.QueryOrdersReq;
import com.gatepay.api.bill.model.resp.QueryOrdersResp;
import com.gatepay.api.channelmanage.ApiChannelManage;
import com.gatepay.api.channelmanage.model.req.DeleteReq;
import com.gatepay.api.channelmanage.model.req.ListReq;
import com.gatepay.api.channelmanage.model.req.SaveReq;
import com.gatepay.api.channelmanage.model.req.UpdateReq;
import com.gatepay.api.channelmanage.model.resp.DeleteResp;
import com.gatepay.api.channelmanage.model.resp.ListResp;
import com.gatepay.api.channelmanage.model.resp.SaveResp;
import com.gatepay.api.channelmanage.model.resp.UpdateResp;
import com.gatepay.api.checkout.ApiCheckout;
import com.gatepay.api.convert.ApiConvert;
import com.gatepay.api.convert.model.req.PreviewReq;
import com.gatepay.api.convert.model.req.QueryCurrencyReq;
import com.gatepay.api.convert.model.req.QueryPairReq;
import com.gatepay.api.convert.model.resp.PreviewResp;
import com.gatepay.api.convert.model.resp.QueryCurrencyResp;
import com.gatepay.api.convert.model.resp.QueryPairResp;
import com.gatepay.api.gift.ApiGift;
import com.gatepay.api.gift.model.req.CreateReq;
import com.gatepay.api.gift.model.req.ListTempReq;
import com.gatepay.api.gift.model.req.QueryReq;
import com.gatepay.api.gift.model.resp.CreateResp;
import com.gatepay.api.gift.model.resp.ListTempResp;
import com.gatepay.api.gift.model.resp.QueryResp;
import com.gatepay.api.payment.ApiPayment;
import com.gatepay.api.qrcode.ApiQrCode;
import com.gatepay.api.web.ApiWeb;
import com.gatepay.api.withdraw.ApiWithdraw;


public class GatePayClient {

    private ApiAddress apiAddress;
    private ApiBill apiBill;
    private ApiChannelManage apiChannelManage;
    private ApiCheckout apiCheckout;
    private ApiConvert apiConvert;
    private ApiGift apiGift;
    private ApiPayment apiPayment;
    private ApiQrCode apiQrCode;
    private ApiWeb apiWeb;
    private ApiWithdraw apiWithdraw;


    public GatePayClient(GatePayConfig gatePayConfig) {
        this.apiAddress = new ApiAddress(gatePayConfig);
        this.apiBill = new ApiBill(gatePayConfig);
        this.apiChannelManage = new ApiChannelManage(gatePayConfig);
        this.apiCheckout = new ApiCheckout(gatePayConfig);
        this.apiConvert = new ApiConvert(gatePayConfig);
        this.apiGift = new ApiGift(gatePayConfig);
        this.apiPayment = new ApiPayment(gatePayConfig);
        this.apiQrCode = new ApiQrCode(gatePayConfig);
        this.apiWeb = new ApiWeb(gatePayConfig);
        this.apiWithdraw = new ApiWithdraw(gatePayConfig);
    }


    /**
     * 查询支持链列表
     */
    public ChainsResp getAddressChains(ChainsReq request) {
        return this.apiAddress.getAddressChains(request);
    }

    /**
     * 查询支持币种列表
     */
    public CurrenciesResp getAddressCurrencies() {
        return this.apiAddress.getAddressCurrencies();
    }

    /**
     * 创建闪兑地址支付单之前，根据订单币种查询支持闪兑的币种，用户从支持闪兑的币种列表中选择实际支付币种创建闪兑支付订单
     */
    public SupportedConvertCurrenciesResp getAddressSupportedConvertCurrencies(SupportedConvertCurrenciesReq request) {
        return this.apiAddress.getSupportedConvertCurrencies(request);
    }

    /**
     * 创建地址支付订单/下单
     */
    public CreateOrderResp createAddressOrder(CreateOrderReq request) {
        return this.apiAddress.createOrder(request);
    }

    /**
     * 查询地址支付订单详情
     */
    public QueryOrderResp queryAddressOrder(QueryOrderReq request) {
        return this.apiAddress.queryOrder(request);
    }

    /**
     * 创建非闪兑支付单退款
     */
    public CreateRefundResp createAddressRefund(CreateRefundReq request) {
        return this.apiAddress.createRefund(request);
    }

    /**
     * 创建闪兑支付单退款
     */
    public CreateRefundConvertResp createAddressRefundConvert(CreateRefundConvertReq request) {
        return this.apiAddress.createRefundConvert(request);
    }

    /**
     * 查询链上交易详情
     */
    public TransactionDetailResp addressTransactionDetail(TransactionDetailReq request) {
        return this.apiAddress.transactionDetail(request);
    }

    /**
     *
     */
    public QueryOrdersResp queryBillOrders(QueryOrdersReq request) {
        return this.apiBill.queryOrders(request);
    }

    /**
     * 新增客户渠道
     */
    public SaveResp saveChannelManage(SaveReq request) {
        return this.apiChannelManage.save(request);
    }

    /**
     * 查询客户渠道列表
     */
    public ListResp listChannelManage(ListReq request)  {
        return this.apiChannelManage.list(request);
    }

    /**
     * 修改客户渠道
     */
    public UpdateResp updateChannelManage(UpdateReq request) {
        return this.apiChannelManage.update(request);
    }

    /**
     * 删除客户渠道
     */
    public DeleteResp deleteChannelManage(DeleteReq request)  {
        return this.apiChannelManage.delete(request);
    }

    /**
     * 创建收银台订单
     */
    public com.gatepay.api.checkout.model.resp.CreateOrderResp createCheckoutOrder(com.gatepay.api.checkout.model.req.CreateOrderReq request) {
        return this.apiCheckout.createOrder(request);
    }

    /**
     * 创建退款
     */
    public com.gatepay.api.checkout.model.resp.CreateRefundResp createCheckoutRefund(com.gatepay.api.checkout.model.req.CreateRefundReq request) {
        return this.apiCheckout.createRefund(request);
    }

    /**
     * 查询可用闪兑币种
     */
    public QueryCurrencyResp queryConvertCurrency(QueryCurrencyReq request) {
        return this.apiConvert.queryCurrency(request);
    }

    /**
     * 查询可用币种对
     */
    public QueryPairResp queryConvertPair(QueryPairReq request) {
        return this.apiConvert.queryPair(request);
    }

    /**
     * 预览报价
     */
    public PreviewResp previewConvert(PreviewReq request) {
        return this.apiConvert.preview(request);
    }

    /**
     * 闪兑下单
     */
    public com.gatepay.api.convert.model.resp.CreateOrderResp createConvertOrder(com.gatepay.api.convert.model.req.CreateOrderReq request) {
        return this.apiConvert.createOrder(request);
    }

    /**
     * 查询闪兑订单
     */
    public com.gatepay.api.convert.model.resp.QueryOrderResp queryConvertOrder(com.gatepay.api.convert.model.req.QueryOrderReq request) {
        return this.apiConvert.queryOrder(request);
    }

    /**
     * 创建礼品卡
     */
    public CreateResp createGift(CreateReq request) {
        return this.apiGift.create(request);
    }

    /**
     * 列出礼品卡模板
     */
    public ListTempResp listGiftTemp(ListTempReq request) {
        return this.apiGift.listTemp(request);
    }

    /**
     * 查询礼品卡
     */
    public QueryResp queryGift(QueryReq request) {
        return this.apiGift.query(request);
    }

    /**
     * 创建扫码支付订单
     */
    public com.gatepay.api.qrcode.model.resp.CreateOrderResp createQrCodeOrder(com.gatepay.api.qrcode.model.req.CreateOrderReq request) {
        return this.apiQrCode.createOrder(request);
    }

}
