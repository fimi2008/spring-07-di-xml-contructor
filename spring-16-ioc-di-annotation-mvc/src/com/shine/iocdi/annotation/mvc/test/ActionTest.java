package com.shine.iocdi.annotation.mvc.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shine.iocdi.annotation.mvc.action.PersonAction;

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
