package com.gatepay.api.address.model.response;

import com.gatepay.common.BaseResponse;

public class ChainsResp extends BaseResponse {

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




    private class ChainNameItem {
        private String chain;
        private String currency;
        private String fullCurrType;
        private String symbol;
        private String explorerUrl;
        private String showChainNameEn;


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

        public String getFullCurrType() {
            return fullCurrType;
        }

        public void setFullCurrType(String fullCurrType) {
            this.fullCurrType = fullCurrType;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
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
    }

}
