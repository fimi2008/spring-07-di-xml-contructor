package com.shine.di.scan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.shine.di.scan.dao.PersonDao;
import com.shine.di.scan.service.PersonService;

/**
 * Created by Administrator on 2016/4/21.
 */
@Component("personService")
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