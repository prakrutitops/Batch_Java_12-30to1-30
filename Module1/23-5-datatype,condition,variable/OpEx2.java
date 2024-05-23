package com.a235;

public class OpEx2 
{
	public static void main(String[] args) 
	{
		
		int a = 6;
		int b = 3;
		int c= 6;
		
		System.out.println(a==b);//false
		System.out.println(a==c);//true
		
		c=b;
		System.out.println(c);
		System.out.println(a==c);//false
	}
}
