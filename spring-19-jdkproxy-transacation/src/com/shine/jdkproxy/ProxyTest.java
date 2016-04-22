package com.shine.jdkproxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

/**
*
*   问题：
*      1、拦截器中的invoke方法在什么时候被调用的
*         在代理对象调用方法的时候，进入了拦截器中的invoke方法
*      2、拦截器中的method参数是什么？在什么时候由实参传递给形参的
*         代理对象的方法的名称是什么，method参数就是什么
*         代理对象调用方法的时候，进入了拦截器中的invoke方法，这个时候，传递参数
*      3、生成的代理对象实现了接口，代理对象的方法体的内容是什么？
*         方法体的内容就是拦截器中的invoke方法体的内容
*/

/**
* jdkproxy的优点
*     动态的产生代理对象，所以只需要用一个拦截器就可以了
* jdkproxy的缺点
*     如果在invoke方法中做事务的判断，将是一件很复杂的事情
*     程序员还是写拦截器了，写拦截器中的invoke方法了，所以invoke方法还需要修改
*     
*  说明：
*      目标类和代理类实现了共同的接口
*/
public class ProxyTest {
	@Test
	public void testProxy(){
		PersonDao personDao = new PersonDaoImpl();
		Transaction transaction = new Transaction();
		MyInterceptor myInterceptor = new MyInterceptor(personDao, transaction);
		/**
		 * 第一个参数  目标类的类加载器
		 * 第二个参数  目标类实现的所有的接口
		 * 第三个参数  拦截器
		 */
		PersonDao newProxy = (PersonDao)Proxy.newProxyInstance(personDao.getClass().getClassLoader(), personDao.getClass().getInterfaces(), myInterceptor);
		newProxy.savePerson();
	}
}
