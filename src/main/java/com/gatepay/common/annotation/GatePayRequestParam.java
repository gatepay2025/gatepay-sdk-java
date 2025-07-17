package com.gatepay.common.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface GatePayRequestParam {

    boolean required() default true;

}
