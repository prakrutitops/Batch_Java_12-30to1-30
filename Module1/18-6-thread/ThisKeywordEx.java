package com.a186keyword;

public class ThisKeywordEx 
{
	int id;
	String name;
	static String college="Atmiya";
	
	public ThisKeywordEx(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		
		//this is working as a refrence keyword
		
		this.id = id;
		this.name = name;
		
	}
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	static void change()
	{
		college ="VVP";
	}
	
	public static void main(String[] args) 
	{
		change();
		
		ThisKeywordEx t1 = new ThisKeywordEx(101,"abcd");
		ThisKeywordEx t2 = new ThisKeywordEx(102,"pqrs");
		
		t1.display();
		t2.display();
		
	}
}

