package com.shine.iocdi.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shine.iocdi.annotation.extend.SuperPerson;
import com.shine.iocdi.xml.extend.StudentX;

public class TestXMLAnnotationExtends {

	/**
	 * spring 容器使用xml实现继承
	 * TODO
	 * @author xiang_wang
	 * 2016年4月22日下午3:31:24
	 */
	@Test
	public void testXMLExtends(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentX x = (StudentX)context.getBean("studentX");
		
		System.out.println(x.getName());
	}
	
	/**
	 * spring 容器 使用注解实现继承
	 * TODO
	 * @author xiang_wang
	 * 2016年4月22日下午3:31:41
	 */
	@Test
	public void testAnnotationExtends(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SuperPerson sup = (SuperPerson)context.getBean("superPerson");
		sup.sayHi();
	}
}
