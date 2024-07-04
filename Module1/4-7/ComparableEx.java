package com.a47;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	
	int age;
	String name;
	
	public Student(int age,String name) 
	{
		// TODO Auto-generated constructor stub
		
		this.age=age;
		this.name=name;
	}
	

	@Override
	public int compareTo(Student o) 
	{
		if(this.age==o.age)
		return 0;
		
		else if(this.age>o.age)
		return 1;
		
		else if(this.age<o.age)
		return -1;
		
		
		return 0;
	}
	
}

public class ComparableEx 
{
	public static void main(String[] args)
	{
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(15, "A"));
		al.add(new Student(13, "P"));
		al.add(new Student(18, "Q"));
	
		Collections.sort(al);
		
		for(Student s : al)
		{
			System.out.println(s.name+" "+s.age);
		}
		
	}
}
