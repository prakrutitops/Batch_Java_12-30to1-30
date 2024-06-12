package com.a126;

public class StringDeclarationEx 
{
	public static void main(String[] args) 
	{
		
		String s = "tops";//literal String
		
		String s2 = new String("tops");//object String
		
		char ch[]= {'t','o','p','s'};//character array string
		String s3 = new String(ch);
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
	}
}
