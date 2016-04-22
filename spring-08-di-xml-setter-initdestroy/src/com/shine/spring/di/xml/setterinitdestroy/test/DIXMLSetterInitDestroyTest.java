package com.shine.spring.di.xml.setterinitdestroy.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shine.spring.di.xml.setterinitdestroy.Person;

public class DIXMLSetterInitDestroyTest {

	/**
	 * 1.启动spring容器
	 * 2.实例化person,student对象
	 * 3.调用person的setter方法进行装配
	 * 4.调用person的init方法
	 * 5.context.getBean
	 * 6.person调用方法完成任务
	 * 7.person在spring容器销毁前person调用destroy方法
	 * @author xiang_wang
	 * 2016年4月21日下午5:48:03
	 */
	@Test
	public void testDI_XML_Setter_InitDestroy(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person.toString());
		
		ClassPathXmlApplicationContext application = (ClassPathXmlApplicationContext)context;
		application.close();
	}
}