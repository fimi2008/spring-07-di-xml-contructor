package com.shine.di.annotation.dao.impl;

import com.shine.di.annotation.dao.PersonDao;

/**
 * Created by Administrator on 2016/4/21.
 */
public class PersonDaoImpl implements PersonDao {
    public void save() {
        System.out.println("PersonDao save 操作");
    }
}
