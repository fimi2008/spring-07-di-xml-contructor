package com.shine.proxy;

import org.junit.Test;

/*
 * 静态代码模式：
 *    1、在该系统中，有多少dao，就得写多少proxy
 *    2、如果目标接口有方法的改动，则proxy也得做相应的修改
 */
public class ProxyTest {
	@Test
	public void testProxy(){
		PersonDao personDao = new PersonDaoImpl();
		Transaction transaction = new Transaction();
		PersonDaoProxy proxy = new PersonDaoProxy(personDao, transaction);
		proxy.savePerson();
	}
}
