package com.shine.iocdi.annotation.extend;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	@Resource(name = "student")
	private Student student;
	
	public void sayHi(){
		student.sayHi();
	}
}