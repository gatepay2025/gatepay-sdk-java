/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
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
