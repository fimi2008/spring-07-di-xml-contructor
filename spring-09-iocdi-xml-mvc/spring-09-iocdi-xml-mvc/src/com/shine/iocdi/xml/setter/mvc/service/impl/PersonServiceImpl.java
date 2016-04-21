package com.shine.iocdi.xml.setter.mvc.service.impl;

import com.shine.iocdi.xml.setter.mvc.dao.PersonDao;
import com.shine.iocdi.xml.setter.mvc.service.PersonService;

/**
 * Created by Administrator on 2016/4/21.
 */
public class PersonServiceImpl implements PersonService {

    private PersonDao personDao;

    public void save() {
        personDao.save();
    }

    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }
}
