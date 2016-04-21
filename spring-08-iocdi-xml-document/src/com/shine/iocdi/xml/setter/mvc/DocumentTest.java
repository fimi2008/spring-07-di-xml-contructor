package com.shine.iocdi.xml.setter.mvc;

import com.shine.iocdi.xml.setter.Document;
import com.shine.iocdi.xml.setter.DocumentManger;
import com.shine.iocdi.xml.setter.WordDocument;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/4/21.
 */
public class DocumentTest {

    @Test
    public void testDocument_NO_Spring(){
        /**
         * 等号的左边是接口,等号的右边是实现类
         */
        Document document = new WordDocument();
        DocumentManger dm = new DocumentManger(document);
        dm.read();
        dm.write();
    }

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
