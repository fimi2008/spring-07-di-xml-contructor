package com.shine.iocdi.annotation.extend;

import org.springframework.stereotype.Component;

@Component("student")
public class Student{
	public void sayHi(){
		System.out.println("hi!~");
	}
}
