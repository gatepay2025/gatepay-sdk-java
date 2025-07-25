package com.gatepay.client;

import com.gatepay.core.api.address.ApiAddress;
import com.gatepay.core.api.address.model.req.*;
import com.gatepay.core.api.address.model.req.CreateOrderReq;
import com.gatepay.core.api.address.model.req.CreateRefundReq;
import com.gatepay.core.api.address.model.req.QueryOrderReq;
import com.gatepay.core.api.address.model.resp.*;
import com.gatepay.core.api.address.model.resp.CreateOrderResp;
import com.gatepay.core.api.address.model.resp.CreateRefundResp;
import com.gatepay.core.api.address.model.resp.QueryOrderResp;
import com.gatepay.core.api.bill.ApiBill;
import com.gatepay.core.api.bill.model.req.QueryOrdersReq;
import com.gatepay.core.api.bill.model.resp.QueryOrdersResp;
import com.gatepay.core.api.channelmanage.ApiChannelManage;
import com.gatepay.core.api.channelmanage.model.req.DeleteReq;
import com.gatepay.core.api.channelmanage.model.req.ListReq;
import com.gatepay.core.api.channelmanage.model.req.SaveReq;
import com.gatepay.core.api.channelmanage.model.req.UpdateReq;
import com.gatepay.core.api.channelmanage.model.resp.DeleteResp;
import com.gatepay.core.api.channelmanage.model.resp.ListResp;
import com.gatepay.core.api.channelmanage.model.resp.SaveResp;
import com.gatepay.core.api.channelmanage.model.resp.UpdateResp;
import com.gatepay.core.api.checkout.ApiCheckout;
import com.gatepay.core.api.convert.ApiConvert;
import com.gatepay.core.api.convert.model.req.PreviewReq;
import com.gatepay.core.api.convert.model.req.QueryCurrencyReq;
import com.gatepay.core.api.convert.model.req.QueryPairReq;
import com.gatepay.core.api.convert.model.resp.PreviewResp;
import com.gatepay.core.api.convert.model.resp.QueryCurrencyResp;
import com.gatepay.core.api.convert.model.resp.QueryPairResp;
import com.gatepay.core.api.gift.ApiGift;
import com.gatepay.core.api.gift.model.req.CreateReq;
import com.gatepay.core.api.gift.model.req.ListTempReq;
import com.gatepay.core.api.gift.model.req.QueryReq;
import com.gatepay.core.api.gift.model.resp.CreateResp;
import com.gatepay.core.api.gift.model.resp.ListTempResp;
import com.gatepay.core.api.gift.model.resp.QueryResp;
import com.gatepay.core.api.payment.ApiPayment;
import com.gatepay.core.api.qrcode.ApiQrCode;
import com.gatepay.core.api.payment.model.req.*;
import com.gatepay.core.api.payment.model.resp.*;
import com.gatepay.core.api.withdraw.ApiWithdraw;
import com.gatepay.core.api.withdraw.model.req.QueryChainsReq;
import com.gatepay.core.api.withdraw.model.req.QueryStatusReq;
import com.gatepay.core.api.withdraw.model.resp.QueryChainsResp;
import com.gatepay.core.api.withdraw.model.resp.QueryStatusResp;
import com.gatepay.common.model.resp.GatePayPageResp;
import com.gatepay.common.model.resp.GatePayResp;
import com.gatepay.common.GatePayConfig;


public class GatePayClient {

    private ApiAddress apiAddress;
    private ApiBill apiBill;
    private ApiChannelManage apiChannelManage;
    private ApiCheckout apiCheckout;
    private ApiConvert apiConvert;
    private ApiGift apiGift;
    private ApiPayment apiPayment;
    private ApiQrCode apiQrCode;
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
        this.apiWithdraw = new ApiWithdraw(gatePayConfig);
    }


    /**
     * 查询支持链列表
     */
    public GatePayResp<ChainsResp> getAddressChains(ChainsReq request) {
        return new GatePayResp<>(this.apiAddress.getAddressChains(request));
    }

    /**
     * 查询支持币种列表
     */
    public GatePayResp<CurrenciesResp> getAddressCurrencies() {
        return new GatePayResp<>(this.apiAddress.getAddressCurrencies());
    }

    /**
     * 创建闪兑地址支付单之前，根据订单币种查询支持闪兑的币种，用户从支持闪兑的币种列表中选择实际支付币种创建闪兑支付订单
     */
    public GatePayResp<SupportedConvertCurrenciesResp> getAddressSupportedConvertCurrencies(SupportedConvertCurrenciesReq request) {
        return new GatePayResp<>(this.apiAddress.getSupportedConvertCurrencies(request));
    }

    /**
     * 创建地址支付订单/下单
     */
    public GatePayResp<CreateOrderResp> createAddressOrder(CreateOrderReq request) {
        return new GatePayResp<>(this.apiAddress.createOrder(request));
    }

    /**
     * 查询地址支付订单详情
     */
    public GatePayResp<QueryOrderResp> queryAddressOrder(QueryOrderReq request) {
        return new GatePayResp<>(this.apiAddress.queryOrder(request));
    }

    /**
     * 创建非闪兑支付单退款
     */
    public GatePayResp<CreateRefundResp> createAddressRefund(CreateRefundReq request) {
        return new GatePayResp<>(this.apiAddress.createRefund(request));
    }

    /**
     * 创建闪兑支付单退款
     */
    public GatePayResp<CreateRefundConvertResp> createAddressRefundConvert(CreateRefundConvertReq request) {
        return new GatePayResp<>(this.apiAddress.createRefundConvert(request));
    }

    /**
     * 查询链上交易详情
     */
    public GatePayResp<TransactionDetailResp> addressTransactionDetail(TransactionDetailReq request) {
        return new GatePayResp<>(this.apiAddress.transactionDetail(request));
    }

    /**
     * 获取资金流水账单
     */
    public GatePayResp<QueryOrdersResp> queryBillOrders(QueryOrdersReq request) {
        return new GatePayResp<>(this.apiBill.queryOrders(request));
    }

    /**
     * 新增客户渠道
     */
    public GatePayResp<SaveResp> saveChannelManage(SaveReq request) {
        return new GatePayResp<>(this.apiChannelManage.save(request));
    }

    /**
     * 查询客户渠道列表
     */
    public GatePayResp<ListResp> listChannelManage(ListReq request)  {
        return new GatePayResp<>(this.apiChannelManage.list(request));
    }

    /**
     * 修改客户渠道
     */
    public GatePayResp<UpdateResp> updateChannelManage(UpdateReq request) {
        return new GatePayResp<>(this.apiChannelManage.update(request));
    }

    /**
     * 删除客户渠道
     */
    public GatePayResp<DeleteResp> deleteChannelManage(DeleteReq request)  {
        return new GatePayResp<>(this.apiChannelManage.delete(request));
    }

    /**
     * 创建收银台订单
     */
    public GatePayResp<com.gatepay.core.api.checkout.model.resp.CreateOrderResp> createCheckoutOrder(com.gatepay.core.api.checkout.model.req.CreateOrderReq request) {
        return new GatePayResp<>(this.apiCheckout.createOrder(request));
    }

    /**
     * 创建退款
     */
    public GatePayResp<com.gatepay.core.api.checkout.model.resp.CreateRefundResp> createCheckoutRefund(com.gatepay.core.api.checkout.model.req.CreateRefundReq request) {
        return new GatePayResp<>(this.apiCheckout.createRefund(request));
    }

    /**
     * 查询可用闪兑币种
     */
    public GatePayResp<QueryCurrencyResp> queryConvertCurrency(QueryCurrencyReq request) {
        return new GatePayResp<>(this.apiConvert.queryCurrency(request));
    }

    /**
     * 查询可用币种对
     */
    public GatePayResp<QueryPairResp> queryConvertPair(QueryPairReq request) {
        return new GatePayResp<>(this.apiConvert.queryPair(request));
    }

    /**
     * 预览报价
     */
    public GatePayResp<PreviewResp> previewConvert(PreviewReq request) {
        return new GatePayResp<>(this.apiConvert.preview(request));
    }

    /**
     * 闪兑下单
     */
    public GatePayResp<com.gatepay.core.api.convert.model.resp.CreateOrderResp> createConvertOrder(com.gatepay.core.api.convert.model.req.CreateOrderReq request) {
        return new GatePayResp<>(this.apiConvert.createOrder(request));
    }

    /**
     * 查询闪兑订单
     */
    public GatePayResp<com.gatepay.core.api.convert.model.resp.QueryOrderResp> queryConvertOrder(com.gatepay.core.api.convert.model.req.QueryOrderReq request) {
        return new GatePayResp<>(this.apiConvert.queryOrder(request));
    }

    /**
     * 创建礼品卡
     */
    public GatePayResp<CreateResp> createGift(CreateReq request) {
        return new GatePayResp<>(this.apiGift.create(request));
    }

    /**
     * 列出礼品卡模板
     */
    public GatePayResp<ListTempResp> listGiftTemp(ListTempReq request) {
        return new GatePayResp<>(this.apiGift.listTemp(request));
    }

    /**
     * 查询礼品卡
     */
    public GatePayResp<QueryResp> queryGift(QueryReq request) {
        return new GatePayResp<>(this.apiGift.query(request));
    }

    /**
     * 创建扫码支付订单
     */
    public GatePayResp<com.gatepay.core.api.qrcode.model.resp.CreateOrderResp> createQrCodeOrder(com.gatepay.core.api.qrcode.model.req.CreateOrderReq request) {
        return new GatePayResp<>(this.apiQrCode.createOrder(request));
    }

    /**
     * 创建web支付订单
     */
    public GatePayResp<com.gatepay.core.api.payment.model.resp.CreateOrderResp> createWebOrder(com.gatepay.core.api.payment.model.req.CreateOrderReq request) {
        return new GatePayResp<>(this.apiPayment.createOrder(request));
    }

    /**
     * 查询订单
     */
    public GatePayResp<com.gatepay.core.api.payment.model.resp.QueryOrderResp> queryWebOrder(com.gatepay.core.api.payment.model.req.QueryOrderReq request) {
        return new GatePayResp<>(this.apiPayment.queryOrder(request));
    }

    /**
     * 关闭订单
     */
    public GatePayResp<CloseOrderResp> closeWebOrder(CloseOrderReq request) {
        return new GatePayResp<>(this.apiPayment.closeOrder(request));
    }

    /**
     * 创建退款订单
     */
    public GatePayResp<com.gatepay.core.api.payment.model.resp.CreateRefundResp> createWebRefund(com.gatepay.core.api.payment.model.req.CreateRefundReq request) {
        return new GatePayResp<>(this.apiPayment.createRefund(request));
    }

    /**
     * 查询退款订单
     */
    public GatePayResp<QueryRefundResp> queryWebRefund(QueryRefundReq request) {
        return new GatePayResp<>(this.apiPayment.queryRefund(request));
    }

    /**
     * 创建批量转账
     */
    public GatePayResp<CreateBatchTransferResp> createBatchTransfer(CreateBatchTransferReq request) {
        return new GatePayResp<>(this.apiPayment.createBatchTransfer(request));
    }

    /**
     * 查询批量转账
     */
    public GatePayPageResp<QueryBatchTransferResp> queryBatchTransfer(QueryBatchTransferReq request) {
        return new GatePayPageResp<>(this.apiPayment.queryBatchTransfer(request));
    }

    /**
     * 查询余额
     */
    public GatePayResp<QueryBalanceResp> queryBalance(QueryBalanceReq request) {
        return new GatePayResp<>(this.apiPayment.queryBalance(request));
    }

    /**
     * 创建提现订单
     */
    public GatePayResp<com.gatepay.core.api.withdraw.model.resp.CreateOrderResp> createWithdrawOrder(com.gatepay.core.api.withdraw.model.req.CreateOrderReq request) {
        return new GatePayResp<>(this.apiWithdraw.createOrder(request));
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
    public GatePayResp<com.gatepay.core.api.withdraw.model.resp.QueryOrderResp> queryWithdrawOrder(com.gatepay.core.api.withdraw.model.req.QueryOrderReq request) {
        return new GatePayResp<>(this.apiWithdraw.queryOrder(request));
    }

    /**
     * 查询币种支持的链
     */
    public GatePayResp<QueryChainsResp> queryWithdrawChains(QueryChainsReq request) {
        return new GatePayResp<>(this.apiWithdraw.queryChains(request));
    }

    /**
     * 查询个人账户余额
     */
    public GatePayResp<com.gatepay.core.api.withdraw.model.resp.QueryBalanceResp> queryWithdrawBalance(com.gatepay.core.api.withdraw.model.req.QueryBalanceReq request) {
        return new GatePayResp<>(this.apiWithdraw.queryBalance(request));
    }

    /**
     * 查询提现状态
     */
    public GatePayResp<QueryStatusResp> queryWithdrawStatus(QueryStatusReq request) {
        return new GatePayResp<>(this.apiWithdraw.queryStatus(request));
    }

}
