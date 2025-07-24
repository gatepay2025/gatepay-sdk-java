package com.gatepay.client;

import com.gatepay.common.GatePayConfig;
import com.gatepay.core.api.address.model.req.*;
import com.gatepay.core.api.address.model.req.CreateOrderReq;
import com.gatepay.core.api.address.model.req.CreateRefundReq;
import com.gatepay.core.api.address.model.req.QueryOrderReq;
import com.gatepay.core.api.bill.model.req.QueryOrdersReq;
import com.gatepay.core.api.channelmanage.model.CustomField;
import com.gatepay.core.api.channelmanage.model.MerchantChannel;
import com.gatepay.core.api.channelmanage.model.req.DeleteReq;
import com.gatepay.core.api.channelmanage.model.req.ListReq;
import com.gatepay.core.api.channelmanage.model.req.SaveReq;
import com.gatepay.core.api.channelmanage.model.req.UpdateReq;
import com.gatepay.core.api.convert.model.req.PreviewReq;
import com.gatepay.core.api.convert.model.req.QueryCurrencyReq;
import com.gatepay.core.api.convert.model.req.QueryPairReq;
import com.gatepay.core.api.gift.model.req.CreateReq;
import com.gatepay.core.api.gift.model.req.ListTempReq;
import com.gatepay.core.api.gift.model.req.QueryReq;
import com.gatepay.core.api.payment.model.BatchOrder;
import com.gatepay.core.api.payment.model.req.*;
import com.gatepay.core.api.withdraw.model.Withdraw;
import com.gatepay.core.api.withdraw.model.req.QueryChainsReq;
import com.gatepay.core.api.withdraw.model.req.QueryStatusReq;
import com.gatepay.common.GatePayConstants;
import com.gatepay.common.model.req.EnvReq;
import com.gatepay.common.model.req.GoodsReq;
import com.gatepay.common.security.Credential;
import com.gatepay.common.utils.RandomUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Date;


public class GatePayClientTest {

    private static GatePayClient gatePayClient;


    @BeforeAll
    public static void init() {
        gatePayClient = new GatePayClient(new GatePayConfig(GatePayConstants.END_POINT_DEFAULT, 30, "mZ96D37oKk-HrWJc", new Credential("Mz6M_q4AkDnZCSoTDo03A6OtWzN5ut8_Uix3jyVjxAU=", "SkZlbKOqPoMwnxhl")));
    }



    /**
     * 查询支持链列表
     */
    @Test
    public void testGetAddressChains() {
        ChainsReq chainsReq = new ChainsReq();
        chainsReq.setCurrency("USDT");
        Assertions.assertNotNull(gatePayClient.getAddressChains(chainsReq));
    }

    /**
     * 查询支持币种列表
     */
    @Test
    public void testGetAddressCurrencies() {
        gatePayClient.getAddressCurrencies();
    }

    /**
     * 创建闪兑地址支付单之前，根据订单币种查询支持闪兑的币种，用户从支持闪兑的币种列表中选择实际支付币种创建闪兑支付订单
     */
    @Test
    public void testGetAddressSupportedConvertCurrencies() {
        SupportedConvertCurrenciesReq supportedConvertCurrenciesReq = new SupportedConvertCurrenciesReq();
        supportedConvertCurrenciesReq.setCurrency("USDT");
        gatePayClient.getAddressSupportedConvertCurrencies(supportedConvertCurrenciesReq);
    }

    /**
     * 创建地址支付订单/下单
     */
    @Test
    public void testCreateAddressOrder() {
        EnvReq envReq = new EnvReq();
        envReq.setTerminalType("MINIAPP");
        GoodsReq goodsReq = new GoodsReq();
        goodsReq.setGoodsName("测试商品");
        goodsReq.setGoodsDetail("测试商品详情");
        CreateOrderReq createOrderReq = new CreateOrderReq();
        createOrderReq.setMerchantTradeNo(RandomUtils.generateNonce(24));
        createOrderReq.setCurrency("USDT");
        createOrderReq.setOrderAmount("9.9");
        createOrderReq.setEnv(envReq);
        createOrderReq.setGoods(goodsReq);
        createOrderReq.setOrderExpireTime(new Date().getTime() + 3 * 60 * 60 * 1000);
        createOrderReq.setReturnUrl("https://www.gate.com/");
        createOrderReq.setCancelUrl("https://www.gate.com/");
        createOrderReq.setMerchantUserId(6790011);
        createOrderReq.setChain("ETH");
        createOrderReq.setFullCurrType("USDT_ETH");
        createOrderReq.setChannelId("");
        gatePayClient.createAddressOrder(createOrderReq);
    }

    /**
     * 查询地址支付订单详情
     */
    @Test
    public void testQueryAddressOrder() {
        QueryOrderReq queryOrderReq = new QueryOrderReq();
        queryOrderReq.setPrepayId("35035237959467017");
        // queryOrderReq.setMerchantTradeNo("7572363776");
        gatePayClient.queryAddressOrder(queryOrderReq);
    }


    /**
     * 创建非闪兑支付单退款
     */
    @Test
    public void testCreateAddressRefund() {
        CreateRefundReq createRefundReq = new CreateRefundReq();
        createRefundReq.setRefundRequestId("342376781523689472");
        createRefundReq.setPrepayId("189325939234050048");
        createRefundReq.setRefundAmount("19.8");
        createRefundReq.setRefundReason("test refund");
        createRefundReq.setReceiverId(6790011);
        gatePayClient.createAddressRefund(createRefundReq);
    }


    /**
     * 创建闪兑支付单退款
     */
    @Test
    public void testCreateAddressRefundConvert() {
        CreateRefundConvertReq createRefundConvertReq = new CreateRefundConvertReq();
        createRefundConvertReq.setRefundRequestId("93840202999210221");
        createRefundConvertReq.setPrepayId("189388469725827072");
        createRefundConvertReq.setRefundOrderCurrency("ETH");
        createRefundConvertReq.setRefundOrderAmount("1");
        createRefundConvertReq.setRefundPayCurrency("USDT");
        createRefundConvertReq.setRefundPayAmount("1.02");
        createRefundConvertReq.setRefundReason("refund test");
        createRefundConvertReq.setReceiverId(6790011);
        gatePayClient.createAddressRefundConvert(createRefundConvertReq);
    }

    /**
     * 查询链上交易详情
     */
    @Test
    public void testAddressTransactionDetail() {
        TransactionDetailReq transactionDetailReq = new TransactionDetailReq();
        transactionDetailReq.setPrepayId("132157692839989248");
        gatePayClient.addressTransactionDetail(transactionDetailReq);
    }

    @Test
    public void testQueryBillOrders() {
        QueryOrdersReq queryOrdersReq = new QueryOrdersReq();
        queryOrdersReq.setStartTime(1705297715000L);
        queryOrdersReq.setEndTime(1705297825000L);
        queryOrdersReq.setPage(1);
        queryOrdersReq.setCount(10);
        queryOrdersReq.setCurrency("USDT");
        queryOrdersReq.setOrderType("1");
        queryOrdersReq.setOrderIdNo("1689667326891627");
        gatePayClient.queryBillOrders(queryOrdersReq);
    }

    /**
     * 新增客户渠道
     */
    @Test
    public void testSaveChannelManage() {
        CustomField customField = new CustomField();
        customField.setCode("87");
        customField.setName("Mike");
        customField.setValue("abc");
        MerchantChannel merchantChannel = new MerchantChannel();
        merchantChannel.setChannelId("44");
        merchantChannel.setDesc("velit");
        merchantChannel.setChannelType("0");
        merchantChannel.setChain("Lorem sed elit id aliqua");
        merchantChannel.setAddress("辽宁省 安乡县 芜湖县 幸路681号 93单元");
        merchantChannel.setCreateTime(1723004848459L);
        merchantChannel.setUpdateTime(1748005235155L);
        merchantChannel.setCustomFields(new CustomField[] { customField });
        SaveReq saveReq = new SaveReq();
        saveReq.setMerchantChannelList(new MerchantChannel[] { merchantChannel });
        gatePayClient.saveChannelManage(saveReq);
    }

    /**
     * 查询客户渠道列表
     */
    @Test
    public void testListChannelManage() {
        ListReq listReq = new ListReq();
        listReq.setChannelId("100");
        // listReq.setDesc("test list");
        // listReq.setChannelType("0");
        listReq.setPage(1);
        listReq.setCount(3);
        gatePayClient.listChannelManage(listReq);
    }

    /**
     * 修改客户渠道
     */
    @Test
    public void testUpdateChannelManage() {
        CustomField customField = new CustomField();
        customField.setCode("87");
        customField.setName("Mike");
        customField.setValue("abc");
        MerchantChannel merchantChannel = new MerchantChannel();
        merchantChannel.setChannelId("44");
        // merchantChannel.setDesc("velit");
        // merchantChannel.setChannelType("0");
        // merchantChannel.setChain("Lorem sed elit id aliqua");
        // merchantChannel.setAddress("辽宁省 安乡县 芜湖县 幸路681号 93单元");
        // merchantChannel.setCreateTime(1723004848459L);
        // merchantChannel.setUpdateTime(1748005235155L);
        // merchantChannel.setCustomFields(new CustomField[] { customField });
        UpdateReq updateReq = new UpdateReq();
        updateReq.setMerchantChannelList(new MerchantChannel[] { merchantChannel });
        gatePayClient.updateChannelManage(updateReq);
    }

    /**
     * 删除客户渠道
     */
    @Test
    public void testDeleteChannelManage()  {
        DeleteReq deleteReq = new DeleteReq();
        deleteReq.setChannelId("100");
        gatePayClient.deleteChannelManage(deleteReq);
    }

    /**
     * 创建收银台订单
     */
    @Test
    public void testCreateCheckoutOrder() {
        EnvReq envReq = new EnvReq();
        envReq.setTerminalType("APP");
        GoodsReq goodsReq = new GoodsReq();
        goodsReq.setGoodsType("02");
        goodsReq.setGoodsName("Sipariş Ödemesi - 177");
        goodsReq.setGoodsDetail("Sipariş No : 160");
        com.gatepay.core.api.checkout.model.req.CreateOrderReq request = new com.gatepay.core.api.checkout.model.req.CreateOrderReq();
        request.setEnv(envReq);
        request.setGoods(goodsReq);
        request.setMerchantTradeNo(RandomUtils.generateNonce(24));
        request.setCurrency("USDT");
        request.setOrderAmount("0.9");
        request.setPayCurrency("USDT");
        request.setMerchantUserId(10002);
        request.setReturnUrl("https://lotkeys.com/tr/gate-payment-response");
        request.setCancelUrl("https://lotkeys.com/tr/gate-payment-response");
        request.setChain("ETH");
        request.setFullCurrType("USDT_ETH");
        request.setChannelId("123");
        gatePayClient.createCheckoutOrder(request);
    }

    /**
     * 创建退款
     */
    @Test
    public void testCreateCheckoutRefund() {
        com.gatepay.core.api.checkout.model.req.CreateRefundReq request = new com.gatepay.core.api.checkout.model.req.CreateRefundReq();
        request.setRefundRequestId("100036668891340");
        request.setPrepayId("383221625532014592");
        request.setRefundOrderCurrency("USDT");
        request.setRefundOrderAmount("0.1");
        request.setRefundPayCurrency("USDT");
        request.setRefundPayAmount("0.1");
        request.setRefundReason("test refund");
        request.setReceiverId(6790011);
        gatePayClient.createCheckoutRefund(request);
    }

    /**
     * 查询可用闪兑币种
     */
    @Test
    public void testQueryConvertCurrency() {
        QueryCurrencyReq queryCurrencyReq = new QueryCurrencyReq();
        queryCurrencyReq.setSide("sell");
        gatePayClient.queryConvertCurrency(queryCurrencyReq);
    }

    /**
     * 查询可用币种对
     */
    @Test
    public void testQueryConvertPair() {
        QueryPairReq queryPairReq = new QueryPairReq();
        queryPairReq.setCurrency("LLT");
        queryPairReq.setSide("buy");
        gatePayClient.queryConvertPair(queryPairReq);
    }

    /**
     * 预览报价
     */
    @Test
    public void testPreviewConvert() {
        PreviewReq previewReq = new PreviewReq();
        previewReq.setBuyCurrency("GT");
        previewReq.setBuyAmount("0.01");
        previewReq.setSellCurrency("USDT");
        gatePayClient.previewConvert(previewReq);
    }

    /**
     * 闪兑下单
     */
    @Test
    public void testCreateConvertOrder() {
        com.gatepay.core.api.convert.model.req.CreateOrderReq createOrderReq = new com.gatepay.core.api.convert.model.req.CreateOrderReq();
        createOrderReq.setQuoteId("PAY-" + RandomUtils.generateNonce(8)); // PAY-0e39c719
        createOrderReq.setClientReqId(RandomUtils.generateNonce(11));
        createOrderReq.setPrice("0.04268034");
        createOrderReq.setSellCurrency("USDT");
        createOrderReq.setSellAmount("0.23429989");
        createOrderReq.setBuyCurrency("GT");
        createOrderReq.setBuyAmount("0.01");
        gatePayClient.createConvertOrder(createOrderReq);
    }

    /**
     * 查询闪兑订单
     */
    @Test
    public void testQueryConvertOrder() {
        com.gatepay.core.api.convert.model.req.QueryOrderReq queryOrderReq = new com.gatepay.core.api.convert.model.req.QueryOrderReq();
        queryOrderReq.setOrderId("326850433152987136");
        gatePayClient.queryConvertOrder(queryOrderReq);
    }

    /**
     * 创建礼品卡
     */
    @Test
    public void testCreateGift() {
        CreateReq request = new CreateReq();
        request.setTitle("anlitest20250210001");
        request.setTemplateId("293409440220057600");
        request.setCurrency("USDT");
        request.setAmount("0.99");
        gatePayClient.createGift(request);
    }

    /**
     * 列出礼品卡模板
     */
    @Test
    public void testListGiftTemp() {
        ListTempReq listTempReq = new ListTempReq();
        gatePayClient.listGiftTemp(listTempReq);
    }

    /**
     * 查询礼品卡
     */
    @Test
    public void testQueryGift() {
        QueryReq queryReq = new QueryReq();
        gatePayClient.queryGift(queryReq);
    }

    /**
     * 创建扫码支付订单
     */
    @Test
    public void testCreateQrCodeOrder() {
        EnvReq envReq = new EnvReq();
        envReq.setTerminalType("APP");
        GoodsReq goodsReq = new GoodsReq();
        goodsReq.setGoodsName("NF2T");
        goodsReq.setGoodsDetail("nef-book");
        com.gatepay.core.api.qrcode.model.req.CreateOrderReq createOrderReq = new com.gatepay.core.api.qrcode.model.req.CreateOrderReq();
        createOrderReq.setMerchantTradeNo(RandomUtils.generateNonce(18));
        createOrderReq.setCurrency("USDT");
        createOrderReq.setOrderAmount("0.9");
        createOrderReq.setEnv(envReq);
        createOrderReq.setGoods(goodsReq);
        createOrderReq.setReturnUrl("http://www.baidu.com");
        gatePayClient.createQrCodeOrder(createOrderReq);
    }

    /**
     * 创建web支付订单
     */
    @Test
    public void testCreateWebOrder() {
        EnvReq envReq = new EnvReq();
        envReq.setTerminalType("MINIAPP");
        GoodsReq goodsReq = new GoodsReq();
        goodsReq.setGoodsName("25000000元宝");
        goodsReq.setGoodsDetail("充值");
        com.gatepay.core.api.payment.model.req.CreateOrderReq createOrderReq = new com.gatepay.core.api.payment.model.req.CreateOrderReq();
        createOrderReq.setMerchantTradeNo(RandomUtils.generateNonce(14));
        createOrderReq.setCurrency("USDT");
        createOrderReq.setOrderAmount("0.1");
        createOrderReq.setEnv(envReq);
        createOrderReq.setGoods(goodsReq);
        createOrderReq.setExtendInfo("1_elbt01_16882172126048");
        createOrderReq.setChannelId("123");
        gatePayClient.createWebOrder(createOrderReq);
    }

    /**
     * 查询订单
     */
    @Test
    public void testQueryWebOrder() {
        com.gatepay.core.api.payment.model.req.QueryOrderReq queryOrderReq = new com.gatepay.core.api.payment.model.req.QueryOrderReq();
        queryOrderReq.setMerchantTradeNo("1688217212j916");
        gatePayClient.queryWebOrder(queryOrderReq);
    }

    /**
     * 关闭订单
     */
    @Test
    public void testCloseWebOrder() {
        CloseOrderReq closeOrderReq = new CloseOrderReq();
        closeOrderReq.setMerchantTradeNo("1688217212j916");
        gatePayClient.closeWebOrder(closeOrderReq);
    }

    /**
     * 创建退款订单
     */
    @Test
    public void testCreateWebRefund() {
        com.gatepay.core.api.payment.model.req.CreateRefundReq createRefundReq = new com.gatepay.core.api.payment.model.req.CreateRefundReq();
        createRefundReq.setRefundRequestId("4379824792349592517");
        createRefundReq.setPrepayId("188976582282448896");
        createRefundReq.setRefundAmount("0.9");
        gatePayClient.createWebRefund(createRefundReq);
    }

    /**
     * 查询退款订单
     */
    @Test
    public void testQueryWebRefund() {
        QueryRefundReq queryRefundReq = new QueryRefundReq();
        queryRefundReq.setRefundRequestId("156123911");
        gatePayClient.queryWebRefund(queryRefundReq);
    }

    /**
     * 创建批量转账
     */
    @Test
    public void testCreateBatchTransfer() {
        BatchOrder batchOrder = new BatchOrder();
        batchOrder.setUserId(6790011);
        batchOrder.setAmount("2");
        CreateBatchTransferReq createBatchTransferReq = new CreateBatchTransferReq();
        createBatchTransferReq.setBatchid(RandomUtils.generateNonce(14));
        createBatchTransferReq.setMerchantBatchNo(RandomUtils.generateNonce(24));
        createBatchTransferReq.setBizscene("REWARDS");
        createBatchTransferReq.setMerchantId("10002");
        createBatchTransferReq.setClientId("mZ96D37oKk-HrWJc");
        createBatchTransferReq.setCurrency("USDT");
        createBatchTransferReq.setName("Larry");
        createBatchTransferReq.setDescription("bonus");
        createBatchTransferReq.setBatchorderList(new BatchOrder[]{ batchOrder });
        gatePayClient.createBatchTransfer(createBatchTransferReq);
    }

    /**
     * 查询批量转账
     */
    @Test
    public void testQueryBatchTransfer() {
        QueryBatchTransferReq queryBatchTransferReq = new QueryBatchTransferReq();
        queryBatchTransferReq.setBatchId("93636743354388480");
        queryBatchTransferReq.setMerchantBatchNo("192392929193391");
        queryBatchTransferReq.setDetailStatus("ALL");
        gatePayClient.queryBatchTransfer(queryBatchTransferReq);
    }

    /**
     * 查询余额
     */
    @Test
    public void testQueryBalance() {
        QueryBalanceReq queryBalanceReq = new QueryBalanceReq();
        gatePayClient.queryBalance(queryBalanceReq);
    }

    /**
     * 创建提现订单
     */
    @Test
    public void testCreateWithdrawOrder() {
        Withdraw withdraw = new Withdraw();
        withdraw.setMerchant_withdraw_id(RandomUtils.generateNonce(19));
        withdraw.setCurrency("USDT");
        withdraw.setAmount("0.001");
        withdraw.setChain("ETH");
        withdraw.setAddress("0x1234567890abcdef");
        withdraw.setMemo("Payment for services-1");
        withdraw.setFee_type(1);
        com.gatepay.core.api.withdraw.model.req.CreateOrderReq createOrderReq = new com.gatepay.core.api.withdraw.model.req.CreateOrderReq();
        createOrderReq.setBatch_id(RandomUtils.generateNonce(18));
        createOrderReq.setWithdraw_list(new Withdraw[] { withdraw });
        gatePayClient.createWithdrawOrder(createOrderReq);
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
    @Test
    public void testQueryWithdrawOrder() {
        com.gatepay.core.api.withdraw.model.req.QueryOrderReq queryOrderReq = new com.gatepay.core.api.withdraw.model.req.QueryOrderReq();
        queryOrderReq.setBatch_id("237394559478075555");
        queryOrderReq.setDetail_status("ALL");
        gatePayClient.queryWithdrawOrder(queryOrderReq);
    }

    /**
     * 查询币种支持的链
     */
    @Test
    public void testQueryWithdrawChains() {
        QueryChainsReq queryChainsReq = new QueryChainsReq();
        queryChainsReq.setCurrency("GT");
        gatePayClient.queryWithdrawChains(queryChainsReq);
    }

    /**
     * 查询个人账户余额
     */
    @Test
    public void testQueryWithdrawBalance() {
        com.gatepay.core.api.withdraw.model.req.QueryBalanceReq queryChainsReq = new com.gatepay.core.api.withdraw.model.req.QueryBalanceReq();
        gatePayClient.queryWithdrawBalance(queryChainsReq);
    }

    /**
     * 查询提现状态
     */
    @Test
    public void testQueryWithdrawStatus() {
        QueryStatusReq queryStatusReq = new QueryStatusReq();
        queryStatusReq.setCurrency("USDT");
        new GatePayClient(new GatePayConfig(GatePayConstants.END_POINT_OPEN_PLATFORM, 30, "mZ96D37oKk-HrWJc", new Credential("Mz6M_q4AkDnZCSoTDo03A6OtWzN5ut8_Uix3jyVjxAU=", "SkZlbKOqPoMwnxhl")))
                .queryWithdrawStatus(queryStatusReq);
    }

}
