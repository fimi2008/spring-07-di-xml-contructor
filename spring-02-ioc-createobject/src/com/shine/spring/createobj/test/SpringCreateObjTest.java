package com.shine.spring.createobj.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shine.spring.createobj.HelloWorld;

public class SpringCreateObjTest {

	/**
	 * spring 容器默认的情况下使用默认的构造函数创建对象
	 * @author xiang_wang
	 * 2016年4月21日上午11:14:02
	 */
	@Test
	public void createObjTest_default(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloworld");
		helloWorld.hello();
	}
	
	/**
	 * 在spring容器内部,调用了HelloWorldFactory中的getInstance方法
	 * 而该方法的内容就是创建对象的过程,是由程序员来完成
	 * @author xiang_wang
	 * 2016年4月21日上午11:20:43
	 */
	@Test
	public void createObjTest_static_factory(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloworld2");
		helloWorld.hello();
	}
	
	/**
	 * 实例工厂
	 * 	1.spring容器创建一个实例工厂bean
	 * 	2.该bean调用了工厂方法getInstance产生对象
	 * TODO
	 * @author xiang_wang
	 * 2016年4月21日上午11:26:21
	 */
	@Test
	public void createObTest_instance_factory(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloworld3");
		helloWorld.hello();
	}
}
