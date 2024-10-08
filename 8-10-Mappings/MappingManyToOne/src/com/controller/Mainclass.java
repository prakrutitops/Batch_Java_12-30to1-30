package com.controller;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.model.Address;
import com.model.Person;

public class Mainclass {
public static void main(String[] args) {
	Session sess =  new Util().getConnect();
	Transaction tr = sess.beginTransaction();
	Person p = new Person();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter name:");
	p.setName(sc.next());
	
	Address ad = new Address();
	Address ad1 = new Address();

	System.out.println("Enter Address:");
	ad.setAddr(sc.next());
	ad.setPerson(p);
	System.out.println("Enter Residence:");
	ad1.setAddr(sc.next());
	ad1.setPerson(p);
	
	
	sess.save(p);
	sess.save(ad);
	sess.save(ad1);
	tr.commit();
	sess.close();
}
}
