package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Person;

public class MainClass 
{
	public static void main(String[] args) 
	{
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("beans.xml");
		Person p = (Person) acm.getBean("m1");
		
		System.out.println(p.getName()+" lives in "+p.getCity());
		
	}
}
