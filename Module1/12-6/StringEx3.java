package com.a126;

public class StringEx3 
{
	public static void main(String[] args) 
	{
		
		String s = "tops";
		String s2 ="TECH";
		String s3 ="  java tops  ";
		String s4 ="Java is a programming language, Java is a Platform";
		System.out.println(s.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s3.trim()); 
		System.out.println(s.charAt(0));
	
		System.out.println(s.endsWith("s"));
		System.out.println(s.startsWith("to"));
		System.out.println(s.length());
		System.out.println(s.lastIndexOf("p"));
		System.out.println(s4.replace("Java","Advance Java"));
	}
}
