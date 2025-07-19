package com.gatepay.api.convert;

import com.gatepay.api.BaseApi;
import com.gatepay.api.convert.model.request.QueryCurrencyReq;
import com.gatepay.api.convert.model.response.QueryCurrencyResp;


public class ApiConvert extends BaseApi {

    public QueryCurrencyResp queryCurrency(QueryCurrencyReq request) {
        try {
            return super.process(request, QueryCurrencyResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
