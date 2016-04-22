package com.shine.iocdi.annotation.mvc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shine.iocdi.annotation.mvc.dao.PersonDao;
import com.shine.iocdi.annotation.mvc.service.PersonService;

/**
 * Created by Administrator on 2016/4/21.
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {

	@Resource(name="personDao")
    private PersonDao personDao;

    public void save() {
        personDao.save();
    }
}
