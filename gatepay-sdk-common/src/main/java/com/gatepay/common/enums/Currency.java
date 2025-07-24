package com.gatepay.common.enums;

public enum Currency {

    USDT("USDT"),
    BTC("BTC"),
    ETH("ETH"),
    LTC("LTC"),
    BCH("BCH"),
    GT("GT");


    private String name;

    Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
