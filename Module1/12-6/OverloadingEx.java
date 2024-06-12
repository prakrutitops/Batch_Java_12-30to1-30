package com.a126;

public class OverloadingEx 
{
	
	int cal(int a,int b)
	{
		return a+b;
	}
	double cal(double a,double b)
	{
		return a*b;
	}
	
	public static void main(String[] args) 
	{
		
		OverloadingEx o1 = new OverloadingEx();
		System.out.println(o1.cal(6,5));
		System.out.println(o1.cal(6.0,2.0));
	}
}
