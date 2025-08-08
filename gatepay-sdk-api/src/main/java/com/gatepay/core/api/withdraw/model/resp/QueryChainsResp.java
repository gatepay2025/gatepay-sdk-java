/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.withdraw.model.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseResponse;

/**
 * @Description: 查询币种支持的链响应
 * @Author: ZJ-BE
 * @Date: 2025/07/25
 */
public class QueryChainsResp extends BaseResponse<QueryChainsResp> {

    /**
     * 区块链网络名称（如ERC20、TRC20、BEP20等）
     */
    private String chain;

    /**
     * 区块链网络中文名称（如以太坊、波场等）
     */
    @JsonProperty("name_cn")
    private String nameCn;

    /**
     * 区块链网络英文名称（如Ethereum、Tron等）
     */
    @JsonProperty("name_en")
    private String nameEn;

    /**
     * 币种智能合约地址（原生币如BTC、ETH主网币为空字符串）
     */
    @JsonProperty("contract_address")
    private String contractAddress;

    /**
     * 全局禁用状态：0-启用, 1-禁用
     */
    @JsonProperty("is_disabled")
    private int isDisabled;

    /**
     * 充值功能状态: 0-启用, 1-禁用
     */
    @JsonProperty("is_deposit_disabled")
    private int isDepositDisabled;

    /**
     * 提现功能状态: 0-启用, 1-禁用
     */
    @JsonProperty("is_withdraw_disabled")
    private int isWithdrawDisabled;

    /**
     * 提币精度（小数点位数，如BTC为"6"）
     */
    private String decimal;


    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    public int getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(int isDisabled) {
        this.isDisabled = isDisabled;
    }

    public int getIsDepositDisabled() {
        return isDepositDisabled;
    }

    public void setIsDepositDisabled(int isDepositDisabled) {
        this.isDepositDisabled = isDepositDisabled;
    }

    public int getIsWithdrawDisabled() {
        return isWithdrawDisabled;
    }

    public void setIsWithdrawDisabled(int isWithdrawDisabled) {
        this.isWithdrawDisabled = isWithdrawDisabled;
    }

    public String getDecimal() {
        return decimal;
    }

    public void setDecimal(String decimal) {
        this.decimal = decimal;
    }

}
