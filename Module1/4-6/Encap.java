package com.a46;

import java.util.Scanner;

public class Encap 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Firstname");
		String fname = sc.next();
		
		System.out.println("Enter Your Lastname");
		String lname = sc.next();
		
		System.out.println("Enter Your Email");
		String email = sc.next();
		
		System.out.println("Enter Your Password");
		String pass = sc.next();	
		
		Model m = new Model();
		m.setFname(fname);
		m.setLname(lname);
		m.setEmail(email);
		m.setPass(pass);
		
		
		
		
		//-------------------LOGIN----------------------
		System.out.println("Enter Your Email");
		String email1 = sc.next();
		
		System.out.println("Enter Your Password");
		String pass1 = sc.next();
		
		if(email1.equals(m.getEmail()) && pass1.equals(m.getPass()))
		{
			System.out.println("Logged in Succesfully");
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
		
	}
}
