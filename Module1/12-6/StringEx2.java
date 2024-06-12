package com.a126;

public class StringEx2 
{
	public static void main(String[] args) 
	{
		
		String s = "sachin";
		String s2 = "sachin";
		String s3 = "ratan";
		String s6 = "aops";
		String s4 = new String("sachin");
		String s5 = "SACHIN";
		
		//equals
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s3));
		System.out.println(s.equals(s4));
		System.out.println("-----------------------------");
		
		//equalsignorecase
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.equalsIgnoreCase(s5));
		System.out.println(s.equals(s5));
		
		System.out.println("-----------------------------");
	
		
		//compareTo
		
		System.out.println(s.compareTo(s2));
		System.out.println(s.compareTo(s3));
		System.out.println(s.compareTo(s6));
		System.out.println("-----------------------------");
		
		//==
		System.out.println(s==s2);
		System.out.println(s==s4);
	}
}
