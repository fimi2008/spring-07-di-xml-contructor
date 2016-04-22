package com.shine.spring.scopelazy.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shine.spring.scopelazy.HelloWorld;


public class SpringScopeLazyTest {
	
	/**
	 * 如果scope为"prototype"那么lazy-init属性将失去作用
	 * TODO
	 * @author xiang_wang
	 * 2016年4月21日下午3:54:09
	 */
	@Test
	public void testScope_Prototype_Lazy_Default(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloworld");
		helloWorld.hello();
		HelloWorld helloWorld2 = (HelloWorld)context.getBean("helloworld");
		helloWorld2.hello();
	}
}
