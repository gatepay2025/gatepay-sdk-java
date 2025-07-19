package com.gatepay.api.convert;

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

}
