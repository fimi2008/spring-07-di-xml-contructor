package com.shine.di.scan.action;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.shine.di.scan.service.PersonService;

/**
 * Created by Administrator on 2016/4/21.
 */
@Component
public class PersonAction {

	@Resource(name = "personService")
    private PersonService personService;
    
    public void save(){
        personService.save();
    }
    
    public PersonAction(){
    	System.out.println("new Instance PersonAction");
    }
    
    // 在action构造方法之后调用
    @PostConstruct
    public void init(){
    	System.out.println("action init");
    }
    
    // 在spring容器销毁前调用
    @PreDestroy
    public void destroy(){
    	System.out.println("action destroy");
    }
}
