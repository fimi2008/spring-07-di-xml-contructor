package com.shine.di.annotation.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shine.di.annotation.action.PersonAction;

/**
 * Created by Administrator on 2016/4/21.
 */
public class ActionTest {

	/**
	 * 1.启动spring容器
	 * 2.把spring配置文件中的bean实例化(action,service,dao)
	 * 3.当spring 容器解析配置文件 <context:annotation-config/> spring容器会在纳入spring管理的bean的范围内查找哪些类的属性上是否加有@Resource注解
	 * 4.如果在属性上找到@Resource注解
	 * 		4.1:如果@Resource的注解的name属性值为"",则把@Resource所在的属性的名称和spring容器中的id作匹配,
	 * 				4.1.1:如果配置成功,则赋值
	 * 				4.1.2:如果匹配不成功,则会按类型进行匹配(匹配成功赋值;不成功报错.)
	 * 		4.2:如果@Resource的注解的name属性的值不为"",则解析@Resource注解name属性的值,把值和spring容器中的id进行匹配
	 * 				4.2.1:匹配成功,则赋值
	 * 				4.2.2:匹配失败,则报错
	 * 
	 * 说明:注解代码越来越简单,效率越来越低
	 *		注解只能应用于引用类型
	 * TODO
	 * @author xiang_wang
	 * 2016年4月22日上午10:33:39
	 */
    @Test
    public void testMVC(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonAction personAction = (PersonAction) context.getBean("personAction");

        personAction.save();
    }
}
