package com.shine.iocdi.xml.setter.mvc.action;

import com.shine.iocdi.xml.setter.mvc.service.PersonService;

/**
 * Created by Administrator on 2016/4/21.
 */
public class PersonAction {

    private PersonService personService;

    public PersonService getPersonService() {
        return personService;
    }

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    public void save(){
        personService.save();
    }
}
