package com.shine.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyInterceptor implements MethodInterceptor{
	private Transaction transaction;
	private Object targer;
 
	public MyInterceptor(Object targer, Transaction transaction) {
		this.targer = targer;
		this.transaction = transaction;
	}
	
	public Object createProxy(){
		Enhancer enhancer = new Enhancer();
		enhancer.setCallback(this); // this代表拦截器对象
		enhancer.setSuperclass(targer.getClass()); // 设置代理类的父类为目标类
		return enhancer.create();
	}

	/**
	 * 该方法的内容和jdkpoxy中的invoke方法的内容是一样的
	 */
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		transaction.beginTransaction();
		arg1.invoke(targer, arg2);
		transaction.commit();
		return null;
	}

}
