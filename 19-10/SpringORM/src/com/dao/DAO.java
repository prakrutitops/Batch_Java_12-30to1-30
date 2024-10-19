package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.Person;

public class DAO extends HibernateDaoSupport 
{

	
	public void Insert(Person p)
	{
		this.getHibernateTemplate().save(p);
	}
	
}
