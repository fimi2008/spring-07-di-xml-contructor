package com.shine.spring.initdestroy.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shine.spring.initdestroy.HelloWorld;
import com.shine.spring.initdestroy.HelloWorld2;


public class SpringInitDestroyTest {
	
	/**
	 * 1.启动spring容器
	 * 2.创建helloworld对象
	 * 3.执行init方法	该方法是由spring容器内部调用的
	 * 4.context.getBean() 把对象提取出来
	 * 5.对象调用方法
	 * 6.当执行close方法的时候,执行该对象的destroy方法	是由spring容器内部调用的
	 * @author xiang_wang
	 * 2016年4月21日下午4:03:26
	 */
	@Test
	public void testBean_init_destroy_scope_default(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloworld");
		helloWorld.hello();
		HelloWorld helloWorld2 = (HelloWorld)context.getBean("helloworld");
		helloWorld2.hello();
		ClassPathXmlApplicationContext applicationContext = (ClassPathXmlApplicationContext)context;
		applicationContext.close();
	}
	
	/**
	 * 1.启动spring容器
	 * 2.创建helloworld对象
	 * 3.执行init方法	该方法是由spring容器内部调用的
	 * 4.context.getBean() 把对象提取出来
	 * 5.对象调用方法
	 * scope为"prototype"则没有 destroy
	 * 
	 *  说明:spring 容器不负责销毁
	 * @author xiang_wang
	 * 2016年4月21日下午4:03:26
	 */
	@Test
	public void testBean_init_destroy_scope_prototype(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld2 helloWorld = (HelloWorld2)context.getBean("helloworld2");
		helloWorld.hello();
//		HelloWorld2 helloWorld2 = (HelloWorld2)context.getBean("helloworld2");
//		helloWorld2.hello();
		ClassPathXmlApplicationContext applicationContext = (ClassPathXmlApplicationContext)context;
		applicationContext.close();
	}
}
