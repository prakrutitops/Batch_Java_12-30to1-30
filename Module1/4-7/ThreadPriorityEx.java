package com.a47;

class A extends Thread
{
	@Override
	public void run() 
	{
		
		System.out.println("called");
	
	}
}

class B extends Thread
{
	@Override
	public void run() 
	{
		
		System.out.println("called2");
	
	}
}

public class ThreadPriorityEx 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		B b1 = new B();
	
		a1.setPriority(2);
		b1.setPriority(4);
		
		a1.start();
		b1.start();
		
		
		
		System.out.println(a1.getPriority());
		System.out.println(b1.getPriority());
		
	}
}
