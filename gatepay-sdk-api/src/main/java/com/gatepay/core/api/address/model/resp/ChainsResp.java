package com.gatepay.core.api.address.model.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseResponse;

public class ChainsResp extends BaseResponse<ChainsResp> {

    private String currency;
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




    private static class ChainNameItem {
        private String chain;
        private String currency;

        @JsonProperty("full_curr_type")
        private String fullCurrType;

        private String symbol;

        @JsonProperty("explorer_url")
        private String explorerUrl;

        @JsonProperty("show_chain_name_en")
        private String showChainNameEn;
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
