/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.common;

/**
 * @Description 基础响应类
 * @Author ZJ-BE
 * @Date 2025/07/25
 * @param <T>
 */
public class BaseResponse<T> {

    /**
     * 状态
     */
    private String status;

    /**
     * 编码
     */
    private String code;

    /**
     * 报错信息
     */
    private String errorMessage;

    /**
     * 标签
     */
    private String label;

    /**
     * 数据
     */
    private T data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
