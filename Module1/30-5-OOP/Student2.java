package com.a305;

import java.util.Scanner;

public class Student2 
{
	//variables,data members
	
	int id;
	String name;
	
	public static void main(String[] args)
	{
		//object creation
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
		
		//value assign
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Id");
		s1.id = sc.nextInt();
		
		System.out.println("Enter Your Name");
		s1.name = sc.next();
		
		System.out.println("\n Your Id is : "+s1.id +" \n Your Name is :"+ s1.name);
		
	}
}
