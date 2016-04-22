package com.shine.iocdi.annotation.document.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shine.iocdi.annotation.document.Document;
import com.shine.iocdi.annotation.document.DocumentManger;
import com.shine.iocdi.annotation.document.WordDocument;

/**
 * Created by Administrator on 2016/4/21.
 */
public class DocumentTest {

    /**
     * 在客户端做到了完全的面向接口编程,程序员再也不用在客户端关心document是由谁来实现的
     */
    @Test
    public void testDocument_Spring(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DocumentManger dm = (DocumentManger)context.getBean("documentManger");
        dm.read();
        dm.write();
    }
}
