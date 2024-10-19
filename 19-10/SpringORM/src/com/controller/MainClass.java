package com.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bo.Bo;
import com.model.Person;

public class MainClass 
{
	public static void main(String[] args) 
	{
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("tops.xml");
		Scanner sc = new Scanner(System.in);
		
		Bo bo = (Bo) acm.getBean("bo");
		
		Person p  =  (Person) acm.getBean("model");
		p.setName(sc.next());
		bo.Insert(p);
		 
		
	}
}
