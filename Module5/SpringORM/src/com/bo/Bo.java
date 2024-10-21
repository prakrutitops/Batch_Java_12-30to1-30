package com.bo;

import java.util.List;

import com.dao.DAO;
import com.model.Person;

public class Bo 
{
	DAO dao;

	public DAO getDao() {
		return dao;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}
	
	public void Insert(Person p)
	{
		dao.Insert(p);
	}
	public void Update(Person p)
	{
		dao.Update(p);
	}
	public void Delete(Person p)
	{
		dao.Delete(p);
	}
	public List<Person> getall()
	{
		return dao.getall();
	}
	public Person getsingle(Person p)
	{
		return dao.getSingle(p);
	}
	
}
