package com.shine.iocdi.xml.setter.mvc.test;

import com.shine.iocdi.xml.setter.mvc.action.PersonAction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/4/21.
 */
public class ActionTest {

    @Test
    public void testMVC(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonAction personAction = (PersonAction) context.getBean("personAction");

        personAction.save();
    }
}
