package com.gatepay.api.address.model.response;

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
        private String full_curr_type;
        private String symbol;
        private String explorer_url;
        private String show_chain_name_en;
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

        public String getFull_curr_type() {
            return full_curr_type;
        }

        public void setFull_curr_type(String full_curr_type) {
            this.full_curr_type = full_curr_type;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public String getExplorer_url() {
            return explorer_url;
        }

        public void setExplorer_url(String explorer_url) {
            this.explorer_url = explorer_url;
        }

        public String getShow_chain_name_en() {
            return show_chain_name_en;
        }

        public void setShow_chain_name_en(String show_chain_name_en) {
            this.show_chain_name_en = show_chain_name_en;
        }

        public long getHasWithdrawMemo() {
            return hasWithdrawMemo;
        }

        public void setHasWithdrawMemo(long hasWithdrawMemo) {
            this.hasWithdrawMemo = hasWithdrawMemo;
        }
    }

}
