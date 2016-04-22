package com.shine.spring.createobjwhen.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shine.spring.createobjwhen.HelloWorld;

public class SpringCreateObjWhenTest {

	/**
	 * 1.加载spring容器
	 * 2.spring容器调用默认的构造函数为bean创建对象
	 * 3.利用context.getBean把对象提取出来
	 *
	 * 说明:该形式更安全,如果spring的配置文件中有错误,在启动spring容器的时候就会报错
	 * @author xiang_wang
	 * 2016年4月21日上午11:41:57
	 */
	@Test
	public void testCreateObj_when_default(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloworld");
		helloWorld.hello();
	}
	
	/**
	 * 1.启动spring容器
	 * 2.执行context.getBean
	 * 3.spring容器为该bean创建对象
	 * 
	 * 说明:在启动spring容器的时候是发现不了错误的
	 * @author xiang_wang
	 * 2016年4月21日上午11:47:18
	 */
	@Test
	public void testCreateObj_when_lazy_init_true(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloworld");
		helloWorld.hello();
	}
}
