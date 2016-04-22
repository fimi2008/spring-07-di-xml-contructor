package com.shine.spring.initdestroy;

public class HelloWorld2 {

	public HelloWorld2(){
		System.out.println("new instance! HelloWorld2");
	}
	
	public void hello(){
		System.out.println("hello world! HelloWorld2");
	}
	
	public void init(){
		System.out.println("init HelloWorld2");
	}
	
	public void destroy(){
		System.out.println("destroy HelloWorld2");
	}
}