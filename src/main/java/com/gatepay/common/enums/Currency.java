package com.gatepay.common.enums;

public enum Currency {

    USDT("USDT");


    private String name;

    Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
