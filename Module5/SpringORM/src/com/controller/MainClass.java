package com.controller;

import java.util.List;
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
		Bo bo = (Bo) acm.getBean("bo");
		Person p  =  (Person) acm.getBean("model");
		
		
		
		Scanner sc = new Scanner(System.in);
		//Insert Data
//		System.out.println("Enter Name: ");
//		p.setName(sc.next());
//		bo.Insert(p);
		
		//Delete Data
//		System.out.println("Enter Id");
//		p.setId(sc.nextInt());
//		bo.Delete(p);
		 
		//Update Data
//		System.out.println("Enter Id");
//		p.setId(sc.nextInt());
//		System.out.println("Enter Name");
//		p.setName(sc.next());
//		bo.Update(p);
		
//		List<Person> getall = bo.getall();
//		System.out.println("ID\t|\tName");
//		for (Person person : getall) 
//		{
//			System.out.println(person.getId()+"\t|\t"+person.getName());
//		}
		
		//single record
		System.out.println("Enter id:");
		p.setId(sc.nextInt());
		p = bo.getsingle(p);
		System.out.println(p.getName());
		 
		
	}
}
