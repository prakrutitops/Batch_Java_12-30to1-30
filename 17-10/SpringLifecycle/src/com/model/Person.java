package com.model;

public class Person 
{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void initialization()
	{
		System.out.println("Initialization");
	}
	public void destroy()
	{
		System.out.println("Destroy");
	}
	
}
