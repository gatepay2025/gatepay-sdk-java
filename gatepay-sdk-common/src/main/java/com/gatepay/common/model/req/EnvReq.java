/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.common.model.req;

/**
 * @Description 环境请求
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class EnvReq {

    /**
     * 终端类型
     */
    private String terminalType;

    /**
     * 场景
     */
    private String scene;


    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

}
