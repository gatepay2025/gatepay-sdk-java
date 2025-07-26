/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model;

public class TxDetail {

    private TxDetailStateItem done;
    private TxDetailStateItem wait;


    public TxDetailStateItem getDone() {
        return done;
    }

    public void setDone(TxDetailStateItem done) {
        this.done = done;
    }

    public TxDetailStateItem getWait() {
        return wait;
    }

    public void setWait(TxDetailStateItem wait) {
        this.wait = wait;
    }

}
