package com.a186keyword;

class C implements Runnable
{
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		//super.run();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread A: "+i);
		}
		
	}
}
class D implements Runnable
{
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		//super.run();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread B: "+i);
		}
	}
}

public class Ex2 
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new C());
		Thread t2 = new Thread(new D());
		
		t1.start();
		t2.start();
	}
}
