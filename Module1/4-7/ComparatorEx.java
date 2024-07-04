package com.a47;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student2 
{
	int age;
	String name;
	
	public Student2(int age,String name) 
	{
		// TODO Auto-generated constructor stub
		
		this.age=age;
		this.name=name;
	}

	
	
	
	
}
class AgeComparator implements Comparator<Student2>
{
	int age;
	String name;

	@Override
	public int compare(Student2 o1, Student2 o2) 
	{
		if(o1.age == o2.age)
			return 0;
			
			else if(o1.age > o2.age)
			return 1;
			
			else if(o1.age < o2.age)
			return -1;
			
			return 0;
	}
	
}

class NameComparator implements Comparator<Student2>
{
	int age;
	String name;

	@Override
	public int compare(Student2 o1, Student2 o2) 
	{
		Student2 s1 = (Student2) o1;
		Student2 s2 = (Student2) o2;
		
		
		
		return s1.name.compareTo(s2.name);
	}
	
}


public class ComparatorEx 
{
	public static void main(String[] args)
	{
		Student2 s1 = new Student2(28, "Ayush");
		Student2 s2 = new Student2(15, "Chintan");
		Student2 s3 = new Student2(17, "Dhyey");
		Student2 s4 = new Student2(30, "Brijesh");
		
		ArrayList<Student2> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		//Collections.sort(al, new AgeComparator());
		Collections.sort(al, new NameComparator());
		
		for(Student2 s: al)
		{
			System.out.println(s.name+" "+s.age);
		}
	}
}
