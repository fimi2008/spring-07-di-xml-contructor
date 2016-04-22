package com.shine.di.scan.dao.impl;

import org.springframework.stereotype.Component;

import com.shine.di.scan.dao.PersonDao;

/**
 * Created by Administrator on 2016/4/21.
 */
@Component("personDao")
public class PersonDaoImpl implements PersonDao {
    public void save() {
        System.out.println("PersonDao save 操作");
    }
}
