package com.gatepay.core.api.withdraw.model.resp;

import com.gatepay.common.BaseResponse;


public class QueryChainsResp extends BaseResponse<QueryChainsResp> {

    private String chain;  // 区块链网络名称（如ERC20、TRC20、BEP20等）
    private String name_cn;  // 区块链网络中文名称（如以太坊、波场等）
    private String name_en;  // 区块链网络英文名称（如Ethereum、Tron等）
    private String contract_address;  // 币种智能合约地址（原生币如BTC、ETH主网币为空字符串）
    private int is_disabled;  // 全局禁用状态：0-启用, 1-禁用
    private int is_deposit_disabled;  // 充值功能状态: 0-启用, 1-禁用
    private int is_withdraw_disabled;  // 提现功能状态: 0-启用, 1-禁用
    private String decimal;  // 提币精度（小数点位数，如BTC为"6"）


    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getName_cn() {
        return name_cn;
    }

    public void setName_cn(String name_cn) {
        this.name_cn = name_cn;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public String getContract_address() {
        return contract_address;
    }

    public void setContract_address(String contract_address) {
        this.contract_address = contract_address;
    }

    public int getIs_disabled() {
        return is_disabled;
    }

    public void setIs_disabled(int is_disabled) {
        this.is_disabled = is_disabled;
    }

    public int getIs_deposit_disabled() {
        return is_deposit_disabled;
    }

    public void setIs_deposit_disabled(int is_deposit_disabled) {
        this.is_deposit_disabled = is_deposit_disabled;
    }

    public int getIs_withdraw_disabled() {
        return is_withdraw_disabled;
    }

    public void setIs_withdraw_disabled(int is_withdraw_disabled) {
        this.is_withdraw_disabled = is_withdraw_disabled;
    }

    public String getDecimal() {
        return decimal;
    }

    public void setDecimal(String decimal) {
        this.decimal = decimal;
    }

}
