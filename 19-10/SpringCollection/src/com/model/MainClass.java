package com.model;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
	public static void main(String[] args) 
	{
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("beans.xml");
		Model m = (Model) acm.getBean("t1");
		
		
		System.out.println("----LIST----");
		List<String> list = m.getList();
		for (String string : list) 
		{
			System.out.println(string);
		}
		
		System.out.println("----SET----");
		Set<String> set = m.getSet();
		for (String string : set) 
		{
			System.out.println(string);
		}
		System.out.println("-----MAP-----");
		System.out.println(m.getMap().get("tops"));
		System.out.println("----PROPERTIES------");
		System.out.println(m.getProperties().getProperty("hibernate.dialect"));
	}
}
