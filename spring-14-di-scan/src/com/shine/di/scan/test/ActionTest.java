package com.shine.di.scan.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shine.di.scan.action.PersonAction;

/**
 * Created by Administrator on 2016/4/21.
 */
public class ActionTest {

	/**
	 * 1.启动spring容器
	 * 2.当spring容器解析
	 * 			<context:component-scan base-package="com.shine.di.scan"/>
	 * 		会去base-package指定的包及子包中扫描所有的类
	 * 3.看那些类上面是否加有@Component注解
	 * 		如果该类上面有@Component注解,检查该注解的value属性是否为""
	 * 		如果为"",则会把该注解所在的类的类名以这样的方式
	 * 		@Component
	 * 		pubic class Person{} == <bean id="person" class="..Person"></bean>
	 * 		如果不为"",则以这样的形式:
	 * 		@Component("aa")
	 * 		pubic class Person{} == <bean id="aa" class="..Person"></bean>
	 * 4.扫描spring容器中所有的bean,进行@Resource
	 * TODO
	 * @author xiang_wang
	 * 2016年4月22日下午2:19:14
	 */
    @Test
    public void testMVC(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonAction personAction = (PersonAction) context.getBean("personAction");

        personAction.save();
    }
}
