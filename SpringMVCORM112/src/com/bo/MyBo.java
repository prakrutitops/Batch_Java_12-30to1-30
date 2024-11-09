package com.bo;

import java.util.List;

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
	
	public void insertdata(Person p)
	{
		dao.insertdata(p);
	}
	public List<Person> getall()
	{
		return dao.getall();
	}
	public void updatedata(Person p)
	{
		dao.updatedata(p);
	}
	
	public void deletedata(Person p)
	{
		dao.deletedata(p);
	}
	public Person getPersonById(int id)
	{
		return dao.getPersonById(id);
	}
	
	
}
