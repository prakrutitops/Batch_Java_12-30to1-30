package com.a305;

//parameterized con
public class ConEx4 
{
	int id;
	String name;
	
	public ConEx4(int id,String name) 
	{
		this.id = id;
		this.name = name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
		ConEx4 c1 = new ConEx4(101,"Ajay");
		c1.display();
		
	}
}
