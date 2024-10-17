package com.controller;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Person;

public class MainClass 
{
	public static void main(String[] args) 
	{
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("beans.xml");
		Person p = (Person) acm.getBean("t1");
		System.out.println(p.getName());
		((AbstractApplicationContext) acm).registerShutdownHook();
		
	}
}
