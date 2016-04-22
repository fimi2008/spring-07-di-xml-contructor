package com.shine.di.annotation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.shine.di.annotation.dao.PersonDao;
import com.shine.di.annotation.service.PersonService;

/**
 * Created by Administrator on 2016/4/21.
 */
public class PersonServiceImpl implements PersonService {

	/**
	 * @Autowired
	 * @Qualifier("personDao") 按照id进行匹配
	 * 上面2个注解组合使用相当于@Resource(name="personDao")
	 */
//	@Resource(name="personDao")
	@Autowired // 按照类型进行注解
	@Qualifier("personDao")	
    private PersonDao personDao;

    public void save() {
        personDao.save();
    }
}