package com.shine.spring.di.xml.setter.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shine.spring.di.xml.setter.Person;

public class DIXMLSetterTest {

	/**
	 * 1.启动spring容器
	 * 2.给person创建对象
	 * 3.给student创建对象
	 * 4.调用person的各个属性的setter方法赋值
	 * 5.context.getBean()
	 * 6.对象调用方法 
	 * @author xiang_wang
	 * 2016年4月21日下午5:02:05
	 */
	@Test
	public void testDI_XML_Setter(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person.toString());
	}
	
	/**
	 * person对象为lazy-init="default",student对象lazy-init="true"
	 * 
	 * 1.启动spring容器
	 * 2.给person创建对象
	 * 3.给student创建对象
	 * 4.调用person的各个属性的setter方法赋值
	 * 5.context.getBean()
	 * 6.对象调用方法
	 * @author xiang_wang
	 * 2016年4月21日下午5:13:53
	 */
	@Test
	public void testDI_XML_Setter_Person_Lazyinit_Default_Student_Lazyinit_True(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person.toString());
	}
	
	/**
	 * person对象为lazy-init="true",student对象lazy-init="default"
	 * 由于person对象依赖student
	 * 
	 * 1.启动spring容器
	 * 2.给student创建对象
	 * 3.context.getBean
	 * 4.给person创建对象
	 * 5.调用person的各个属性的setter方法赋值
	 * 6.对象调用方法
	 * @author xiang_wang
	 * 2016年4月21日下午5:13:53
	 */
	@Test
	public void testDI_XML_Setter_Person_Lazyinit_True_Student_Lazyinit_Default(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person.toString());
	}
	
	/**
	 * person对象为scope="prototype",student对象scope="default"
	 * 由于person对象依赖student
	 * 
	 * 1.启动spring容器
	 * 2.给student创建对象
	 * 3.context.getBean
	 * 4.给person创建对象
	 * 5.调用person的各个属性的setter方法赋值
	 * 6.对象调用方法
	 * @author xiang_wang
	 * 2016年4月21日下午5:13:53
	 */
	@Test
	public void testDI_XML_Setter_Person_Scope_Prototype_Student_Scope_Default(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person.toString());
	}
	
	/**
	 * person对象为scope="default",student对象scope="prototype"
	 * 
	 * 1.启动spring容器
	 * 2.给person创建对象
	 * 3.给student创建对象(多个引用多个创建)
	 * 4.调用person的各个属性的setter方法赋值
	 * 5.context.getBean()
	 * 6.对象调用方法
	 * @author xiang_wang
	 * 2016年4月21日下午5:13:53
	 */
	@Test
	public void testDI_XML_Setter_Person_Scope_Default_Student_Scope_Prototype(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person.toString());
	}
}