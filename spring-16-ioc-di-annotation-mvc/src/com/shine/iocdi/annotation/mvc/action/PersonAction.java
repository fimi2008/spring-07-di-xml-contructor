package com.shine.iocdi.annotation.mvc.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.shine.iocdi.annotation.mvc.service.PersonService;

/**
 * Created by Administrator on 2016/4/21.
 */
@Controller("personAction")
public class PersonAction {
	
	@Resource(name = "personService")
    private PersonService personService;

    public void save(){
        personService.save();
    }
}
