package com.shine.spring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.TYPE) // 该注解能够作用在类上
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassInfo {
	String name() default ""; 
}
