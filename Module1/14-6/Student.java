package com.a146;

import java.io.Serializable;

public class Student implements Serializable
{	
	int id;
	int roll;
	
	public Student(int id,int roll) 
	{
		this.id=id;
		this.roll=roll;
	}
}
