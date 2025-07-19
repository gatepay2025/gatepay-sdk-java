package com.gatepay.api.convert;

import com.gatepay.api.convert.model.request.CreateOrderReq;
import com.gatepay.api.convert.model.request.PreviewReq;
import com.gatepay.api.convert.model.request.QueryCurrencyReq;
import com.gatepay.api.convert.model.request.QueryPairReq;
import org.junit.jupiter.api.Test;


public class ApiConvertTest {

    private ApiConvert apiConvert =  new ApiConvert();


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
    public void testConvert() {
        CreateOrderReq createOrderReq = new CreateOrderReq();
        createOrderReq.setQuoteId("PAY-0e39c719");
        createOrderReq.setClientReqId("10");
        createOrderReq.setPrice("0.04268034");
        createOrderReq.setSellCurrency("USDT");
        createOrderReq.setSellAmount("0.23429989");
        createOrderReq.setBuyCurrency("GT");
        createOrderReq.setBuyAmount("0.01");
        apiConvert.convert(createOrderReq);
    }

}
