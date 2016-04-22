package com.shine.spring.scope.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shine.spring.scope.CopyOfHelloWorld;
import com.shine.spring.scope.HelloWorld;

public class SpringScopeTest {
	
	/**
	 * 在默认情况下spring容器产生的对象是单例的
	 * @author xiang_wang
	 * 2016年4月21日上午11:55:25
	 */
	@Test
	public void testSpring_scope_default(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloworld");
		System.out.println(helloWorld);
		
		HelloWorld helloWorld2 = (HelloWorld)context.getBean("helloworld");
		System.out.println(helloWorld2);
	}
	
	/**
	 * 如果scope 为 "prototype",则为多实例
	 * @author xiang_wang
	 * 2016年4月21日下午1:59:34
	 */
	@Test
	public void testSpring_scope_prototype(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CopyOfHelloWorld helloWorld = (CopyOfHelloWorld)context.getBean("helloworld2");
		System.out.println(helloWorld);
		
		CopyOfHelloWorld helloWorld2 = (CopyOfHelloWorld)context.getBean("helloworld2");
		System.out.println(helloWorld2);
	}
}
