package com.gatepay.model.address.response;

public class ChainsResponse {

    private String currency;
    private ChainNameItem[] chains;


    private class ChainNameItem {
        private String chain;
        private String currency;
        private String fullCurrType;
        private String symbol;
        private String explorerUrl;
        private String showChainNameEn;
    }

}
