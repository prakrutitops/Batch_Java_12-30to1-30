package com.model;

public class Person 
{
	
	String name;
	Address address;
	
	public Person(Address address) 
	{
	
		this.address=address;
	
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display()
	{
		System.out.println(name+" lives in "+address.getCity());
	}



	
}
