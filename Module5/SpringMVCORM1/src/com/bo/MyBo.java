package com.bo;

import com.dao.MyDao;
import com.model.Person;

public class MyBo 
{
	MyDao dao;

	public MyDao getDao() {
		return dao;
	}

	public void setDao(MyDao dao) {
		this.dao = dao;
	}
	
	public void insert(Person p)
	{
		dao.insert(p);
	}
	
}
