package com.a305;

public class CopyConEx 
{
	int id;
	String name;
	
	CopyConEx(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		
		this.id=id;
		this.name=name;
	
	}
	
	CopyConEx(CopyConEx c1) 
	{
		// TODO Auto-generated constructor stub
		
		System.out.println(c1.id+" "+c1.name);
	
	}
	void dispaly()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
		CopyConEx c1 = new CopyConEx(101,"Vijay");
		CopyConEx c2 = new CopyConEx(c1);
		
		c1.dispaly();
		//c2.dispaly();
	}
}
