package com.gatepay.api.convert;

import com.gatepay.api.convert.model.request.QueryCurrencyReq;
import org.junit.jupiter.api.Test;

public class ApiConvertTest {

    private ApiConvert apiConvert =  new ApiConvert();


    @Test
    public void testQueryCurrency() {
        QueryCurrencyReq queryCurrencyReq = new QueryCurrencyReq();
        queryCurrencyReq.setSide("sell");
        apiConvert.queryCurrency(queryCurrencyReq);
    }

}
