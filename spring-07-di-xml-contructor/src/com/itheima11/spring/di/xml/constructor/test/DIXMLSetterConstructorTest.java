package com.itheima11.spring.di.xml.constructor.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima11.spring.di.xml.constructor.Person;

public class DIXMLSetterConstructorTest {

	@Test
	public void testDI_XML_Constructor(){
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person)context.getBean("person");
		System.out.println(person.toString());
	}
}
