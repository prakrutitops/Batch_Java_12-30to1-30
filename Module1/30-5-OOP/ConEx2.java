package com.a305;

public class ConEx2 
{
	//data member
	static int count = 0;//static variable
	
	//default constructor
	ConEx2()
	{
		
		count++;
		System.out.println(count);
		
	}
	
	public static void main(String[] args) 
	{
		ConEx2 c1 = new ConEx2();//1
		ConEx2 c2 = new ConEx2();//2
		ConEx2 c3 = new ConEx2();//3
	}
}
