package com.gatepay.core.api.convert;

import com.gatepay.common.GatePayConstants;
import com.gatepay.infrastructure.security.Credential;
import com.gatepay.common.utils.RandomUtils;
import com.gatepay.core.api.convert.model.req.*;
import com.gatepay.infrastructure.GatePayConfig;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class ApiConvertTest {

    private static ApiConvert apiConvert;


    @BeforeAll
    public static void init() {
        apiConvert = new ApiConvert(new GatePayConfig(GatePayConstants.END_POINT_DEFAULT, 30, "mZ96D37oKk-HrWJc", new Credential("Mz6M_q4AkDnZCSoTDo03A6OtWzN5ut8_Uix3jyVjxAU=", "SkZlbKOqPoMwnxhl")));
    }

    @Test
    public void testQueryCurrency() {
        QueryCurrencyReq queryCurrencyReq = new QueryCurrencyReq();
        queryCurrencyReq.setSide("sell");
        apiConvert.queryCurrency(queryCurrencyReq);
    }

    @Test
    public void testQueryPair() {
        QueryPairReq queryPairReq = new QueryPairReq();
        queryPairReq.setCurrency("LLT");
        queryPairReq.setSide("buy");
        apiConvert.queryPair(queryPairReq);
    }

    @Test
    public void testPreview() {
        PreviewReq previewReq = new PreviewReq();
        previewReq.setBuyCurrency("GT");
        previewReq.setBuyAmount("0.01");
        previewReq.setSellCurrency("USDT");
        apiConvert.preview(previewReq);
    }

    @Test
    public void testCreateOrder() {
        CreateOrderReq createOrderReq = new CreateOrderReq();
        createOrderReq.setQuoteId("PAY-" + RandomUtils.generateNonce(8));
        createOrderReq.setClientReqId(RandomUtils.generateNonce(11));
        createOrderReq.setPrice("0.04268034");
        createOrderReq.setSellCurrency("USDT");
        createOrderReq.setSellAmount("0.23429989");
        createOrderReq.setBuyCurrency("GT");
        createOrderReq.setBuyAmount("0.01");
        apiConvert.createOrder(createOrderReq);
    }

    @Test
    public void testQueryOrder() {
        QueryOrderReq queryOrderReq = new QueryOrderReq();
        queryOrderReq.setOrderId("326850433152987136");
        apiConvert.queryOrder(queryOrderReq);
    }

}
