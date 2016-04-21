package com.itheima11.spring.di.xml.constructor;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	private Long pid;
	private String name;
	private Student student;
	private List lists;
	private Set sets;
	private Map map;
	private Object[] objects;
	private Properties properties;
	
	public Person(Long pid,String name){
		this.pid = pid;
		this.name = name;
	}
	
	public Person(String name,Student student){
		this.name  = name;
		this.student = student;
	}
	
	public void init(){
		System.out.println("init");
	}

	public String toString() {
		return "Person{" +
				"pid=" + pid +
				", name='" + name + '\'' +
				", student=" + student +
				", lists=" + lists +
				", sets=" + sets +
				", map=" + map +
				", objects=" + Arrays.toString(objects) +
				", properties=" + properties +
				'}';
	}
}
