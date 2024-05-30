package com.a305;

//parameterized con
public class ConEx3 
{
	int id;
	String name;
	
	public ConEx3(int i,String n) 
	{
		id = i;
		name = n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
		ConEx3 c1 = new ConEx3(101,"Ajay");
		c1.display();
		//System.out.println(c1.id+" "+c1.name);
	}
}
