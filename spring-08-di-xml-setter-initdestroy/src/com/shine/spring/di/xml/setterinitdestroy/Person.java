package com.shine.spring.di.xml.setterinitdestroy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	public Person() {
		System.out.println("Person");
	}
	private Long pid;
	private String name;
	private Student student;
	private List lists;
	private Set sets;
	private Map map;
	private Object[] objs;
	private Properties properties;
	
	public void init(){
		System.out.println("person init");
	}
	
	public void destroy(){
		System.out.println("person destroy");
	}
	
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public List getLists() {
		return lists;
	}
	public void setLists(List lists) {
		this.lists = lists;
	}
	public Set getSets() {
		return sets;
	}
	public void setSets(Set sets) {
		this.sets = sets;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public Object[] getObjs() {
		return objs;
	}
	public void setObjs(Object[] objs) {
		this.objs = objs;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", student=" + student
				+ ", lists=" + lists + ", sets=" + sets + ", map=" + map
				+ ", objs=" + Arrays.toString(objs) + ", properties="
				+ properties + "]";
	}
}
