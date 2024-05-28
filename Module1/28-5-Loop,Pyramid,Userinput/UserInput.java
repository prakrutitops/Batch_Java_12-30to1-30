package com.a285;

import java.util.Scanner;

public class UserInput 
{
	public static void main(String[] args) 
	{
		
		//Scanner
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Id");
		int id = sc.nextInt();
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		System.out.println("Enter Your Salary");
		double salary = sc.nextDouble();
		
		System.out.println(id+" "+name+" "+salary);
		
		
	}
}
