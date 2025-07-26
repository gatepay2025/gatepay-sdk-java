/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.common.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Description GatePay请求参数注解
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface GatePayParam {

    /**
     * 是否必填（默认true）
     * @return
     */
    boolean required() default true;

}
