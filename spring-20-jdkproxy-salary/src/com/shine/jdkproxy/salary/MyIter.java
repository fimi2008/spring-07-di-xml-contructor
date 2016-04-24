package com.shine.jdkproxy.salary;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyIter implements InvocationHandler{
	private Logger logger;
	private Privilege p;
	private Security secu;
	private Object targer;
 
	public MyIter(Object targer, Logger logger, Privilege p, Security secu) {
		this.targer = targer;
		this.logger = logger;
		this.p = p;
		this.secu = secu;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// 启动日志
		logger.logging();
		// 安全性框架
		secu.start();
		// 判断权限
		if(p.getAccess().equals("admin")){
			method.invoke(targer, args);
		}else{
			System.out.println("暂无权限");
		}
		return null;
	}

}
