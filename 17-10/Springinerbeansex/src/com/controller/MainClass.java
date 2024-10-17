package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Person;

public class MainClass 
{
	public static void main(String[] args) 
	{
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("beans.xml");
		Person p1 = (Person) acm.getBean("t1");
		p1.display();
		
	}
}
