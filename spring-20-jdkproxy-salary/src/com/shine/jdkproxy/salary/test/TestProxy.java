package com.shine.jdkproxy.salary.test;

import java.lang.reflect.Proxy;

import org.junit.Test;

import com.shine.jdkproxy.salary.Logger;
import com.shine.jdkproxy.salary.MyIter;
import com.shine.jdkproxy.salary.Privilege;
import com.shine.jdkproxy.salary.SalaryManager;
import com.shine.jdkproxy.salary.SalaryManagerImpl;
import com.shine.jdkproxy.salary.Security;

public class TestProxy {
	
	@Test
	public void testProxy(){
		Logger logger = new Logger();
		Privilege p = new Privilege();
		p.setAccess("admin");
		Security secu = new Security();
		SalaryManager sm = new SalaryManagerImpl();
		MyIter h = new MyIter(sm, logger, p, secu);
		SalaryManager smto = (SalaryManager)Proxy.newProxyInstance(sm.getClass().getClassLoader(), sm.getClass().getInterfaces(), h);
		smto.search();
	}

}
