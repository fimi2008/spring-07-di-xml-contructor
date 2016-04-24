package com.shine.cglibproxy.test;

import org.junit.Test;

import com.shine.cglibproxy.MyInterceptor;
import com.shine.cglibproxy.PersonDaoImpl;
import com.shine.cglibproxy.Transaction;

/**
 * 目标类是代理类的父类
 */
public class ProxyTest {
	@Test
	public void testProxy(){
		PersonDaoImpl target = new PersonDaoImpl();
		Transaction transaction = new Transaction();
		MyInterceptor interceptor = new MyInterceptor(target, transaction);
		PersonDaoImpl proxy = (PersonDaoImpl)interceptor.createProxy();
		proxy.savePerson();
	}
}
