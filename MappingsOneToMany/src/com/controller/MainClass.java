package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.model.Address;
import com.model.Person;

public class MainClass 
{
	public static void main(String[] args)
	{
		
		Session sess =  new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		
		Person p = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		p.setName(sc.next());
		
		Person p2 = new Person();
		System.out.println("Enter name2:");
		p2.setName(sc.next());
		
		Address ad = new Address();
		System.out.println("Enter Address:");
		ad.setAddr(sc.next());
		
		List<Person>list = new ArrayList<Person>();
		list.add(p);
		list.add(p2);
		
		ad.setList(list);
		
		sess.save(p);
		sess.save(p2);
		sess.save(ad);
		tr.commit();
		sess.close();
	}
}
