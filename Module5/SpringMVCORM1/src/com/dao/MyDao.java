package com.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.Person;

public class MyDao extends HibernateDaoSupport
{
	public void insert(Person p)
	{
		this.getHibernateTemplate().save(p);
	}
}
