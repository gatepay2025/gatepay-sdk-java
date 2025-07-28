/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseResponse;

/**
 * @Description 查询支持链列表响应
 * @author ZJ-BE
 * @Date 2025/07/25
 */
public class ChainsResp extends BaseResponse<ChainsResp> {

    /**
     * 币种
     */
    private String currency;

    /**
     * 支持的链列表
     */
    private ChainNameItem[] chains;


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ChainNameItem[] getChains() {
        return chains;
    }

    public void setChains(ChainNameItem[] chains) {
        this.chains = chains;
    }


    /**
     * @Description 支持的链信息
     * @Author ZJ-BE
     * @Date 2025/07/25
     */
    private static class ChainNameItem {

        /**
         * Gate链
         */
        private String chain;

        /**
         * 拟支付的币种
         */
        private String currency;

        /**
         * 含网络信息的币种符号，下单重要参数
         */
        @JsonProperty("full_curr_type")
        private String fullCurrType;

        /**
         * 链上交易符号
         */
        private String symbol;

        /**
         * 浏览链接，explorer + token_address
         */
        @JsonProperty("explorer_url")
        private String explorerUrl;

        /**
         * 链显示名称（英文）
         */
        @JsonProperty("show_chain_name_en")
        private String showChainNameEn;

        /**
         * 是否有提现记录
         */
        private long hasWithdrawMemo;


        public String getChain() {
            return chain;
        }

        public void setChain(String chain) {
            this.chain = chain;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public String getFullCurrType() {
            return fullCurrType;
        }

        public void setFullCurrType(String fullCurrType) {
            this.fullCurrType = fullCurrType;
        }

        public String getExplorerUrl() {
            return explorerUrl;
        }

        public void setExplorerUrl(String explorerUrl) {
            this.explorerUrl = explorerUrl;
        }

        public String getShowChainNameEn() {
            return showChainNameEn;
        }

        public void setShowChainNameEn(String showChainNameEn) {
            this.showChainNameEn = showChainNameEn;
        }

        public long getHasWithdrawMemo() {
            return hasWithdrawMemo;
        }

        public void setHasWithdrawMemo(long hasWithdrawMemo) {
            this.hasWithdrawMemo = hasWithdrawMemo;
        }
    }

}
