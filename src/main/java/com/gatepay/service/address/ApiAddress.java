package com.gatepay.service.address;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gatepay.core.Client;
import com.gatepay.core.signature.Nonce;
import com.gatepay.service.AbstractService;
import com.gatepay.service.address.model.request.*;
import com.gatepay.service.address.model.response.*;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;


/**
 * 地址支付接口
 *
 */
public class ApiAddress extends AbstractService {

    private final String apiKey;
    private final ObjectMapper objectMapper;


    public ApiAddress(String apiKey) {
        this.apiKey = apiKey;
        this.objectMapper = new ObjectMapper();
    }




    /**
     * 查询支持链列表
     *
     * @param request
     * @return
     */
    public ChainsResp getAddressChains(ChainsReq request) {
        try {
            return super.process(request, ChainsResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    /**
     *
     * @return
     */
    public CurrenciesResp getAddressCurrencies() {
        try {
            return super.process(new CurrenciesReq(), CurrenciesResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
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
        try {
            return super.process(request, SupportedConvertCurrenciesResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    /**
     *
     * 创建地址支付订单/下单
     *
     */
    public CreateOrderResp createOrder(CreateOrderReq request) {
        try {
            return super.process(request, CreateOrderResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    /**
     * 查询地址支付订单详情
     *
     * @param request
     * @return
     */
    public QueryOrderResp queryOrder(QueryOrderReq request) {
        try {
            return super.process(request, QueryOrderResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }



    /**
     * 创建非闪兑支付单退款
     *
     */
    public CreateRefundResp createRefund(CreateRefundReq request) {
        try {
            return super.process(request, CreateRefundResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    /**
     * 创建闪兑支付单退款
     *
     * @param request
     * @return
     * @throws JsonProcessingException
     */
    public CreateRefundConvertResp createRefundConvert(CreateRefundConvertReq request) {
        try {
            return super.process(request, CreateRefundConvertResp.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    /**
     * 查询链上交易详情
     *
     * @param request
     * @return
     */
    public TransactionDetailResp transactionDetail(TransactionDetailReq request) {
        try {
            HttpRequest httpRequest = Client.generateHttpRequest(request, System.currentTimeMillis(), Nonce.generateNonce(9));
            HttpResponse<String> response = Client.generateHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new TransactionDetailResp();
    }




    /**
     * 构建查询字符串
     *
     * @param params 参数映射
     * @return 查询字符串
     */
    private String buildQueryStr(Map<String, String> params) {
        if (params.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(entry.getKey()).append("=").append(entry.getValue());
        }
        return sb.toString();
    }

}
