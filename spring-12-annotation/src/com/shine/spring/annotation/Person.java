package com.shine.spring.annotation;

@ClassInfo(name = "人类")
public class Person {
	
	@MethodInfo(name = "说话方法")
	public void say(){
		System.out.println("您好!");
	}
}