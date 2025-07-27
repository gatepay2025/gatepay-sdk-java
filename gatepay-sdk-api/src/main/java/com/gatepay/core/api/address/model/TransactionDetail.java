/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model;

/**
 * @Description 交易详情
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class TransactionDetail {

    private TxDetail inTerm;
    private TxDetail outOfTerm;


    public TxDetail getInTerm() {
        return inTerm;
    }

    public void setInTerm(TxDetail inTerm) {
        this.inTerm = inTerm;
    }

    public TxDetail getOutOfTerm() {
        return outOfTerm;
    }

    public void setOutOfTerm(TxDetail outOfTerm) {
        this.outOfTerm = outOfTerm;
    }

}
