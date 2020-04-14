package com.feign.demo.web.controller;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author liuying
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@My(
        validatedBy = {}
)
public @interface MyField {
    int length() ;

}
@interface  My{

    Class<? extends Demo>[] validatedBy();
}