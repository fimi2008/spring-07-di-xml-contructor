package com.shine.spring.initdestroy;

public class HelloWorld {

	public HelloWorld(){
		System.out.println("new instance! HelloWorld");
	}
	
	public void hello(){
		System.out.println("hello world! HelloWorld");
	}
	
	public void init(){
		System.out.println("init HelloWorld");
	}
	
	public void destroy(){
		System.out.println("destroy HelloWorld");
	}
}