package com.shine.iocdi.annotation.mvc.dao.impl;

import org.springframework.stereotype.Repository;

import com.shine.iocdi.annotation.mvc.dao.PersonDao;

/**
 * Created by Administrator on 2016/4/21.
 */
@Repository("personDao")
public class PersonDaoImpl implements PersonDao {
    public void save() {
        System.out.println("PersonDao save 操作");
    }
}
