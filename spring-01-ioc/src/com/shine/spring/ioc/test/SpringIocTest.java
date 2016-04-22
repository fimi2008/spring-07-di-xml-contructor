package com.shine.spring.ioc.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shine.spring.ioc.HelloWorld;

public class SpringIocTest {

	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld h = (HelloWorld)context.getBean("helloworld");
		h.hello();
		
		HelloWorld h2 = (HelloWorld)context.getBean("hh");
		h2.hello();
	}
	
	
}
