package com.a305;

public class Student 
{
	//variables,data members
	
	int id;
	String name;
	
	public static void main(String[] args)
	{
		//object creation
		Student s1 = new Student();
		Student s2 = new Student();
		
		//value assign
		s1.id=101;
		s1.name="Ajay";
		
		System.out.println(s1.id +" "+ s1.name);
		
	}
}
