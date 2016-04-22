package com.shine.spring.annotation.parse;

import java.lang.reflect.Method;

import com.shine.spring.annotation.ClassInfo;
import com.shine.spring.annotation.MethodInfo;
import com.shine.spring.annotation.Person;

/**
 * 		
 * <p>Title: AnnotationParse </p>
 * <p>Description: 类描述:自定义注解解析器</p>
 * <p>Copyright (c) 2016 </p>
 * @author xiang_wang	
 * @date 2016年4月22日上午10:15:47
 * @version 1.0
 */
public class AnnotationParse {
	
	public static void parse(Class cls){
		// 判断该类上是否存在ClassInfo注解
		if (cls.isAnnotationPresent(ClassInfo.class)){
			ClassInfo classInfo = (ClassInfo)cls.getAnnotation(ClassInfo.class);
			System.out.println(classInfo.name());
		}
		
		Method[] methods = cls.getMethods();
		for (Method method : methods){
			// 判断当前正在遍历的方法上是否存在MethodInfo注解
			if (method.isAnnotationPresent(MethodInfo.class)){
				MethodInfo methodInfo = (MethodInfo)method.getAnnotation(MethodInfo.class);
				System.out.println(methodInfo.name());
			}
		}
	}
	
	public static void main(String[] args) {
		parse(Person.class);
	}
}