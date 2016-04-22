package com.shine.spring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)	// 该注解作用于方法上
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
	String name() default "";
}
