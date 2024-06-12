package com.a126;

class Rbi
{
	int rate()
	{
		return 0;
	}
}
class Sbi extends Rbi
{
	int rate()
	{
		return 7;
	}
}
class Icici extends Rbi
{
	int rate()
	{
		return 8;
	}
}
class Axis extends Rbi
{
	int rate()
	{
		return 9;
	}
}

public class OverridingEx 
{
	public static void main(String[] args) 
	{
		Rbi rbi;//refrence variable
		
		rbi = new Sbi();
		System.out.println(rbi.rate());
		
		rbi = new Icici();
		System.out.println(rbi.rate());
		
		rbi = new Axis();
		System.out.println(rbi.rate());
		
		
		
//		Sbi s = new Sbi();
//		Icici i = new Icici();
//		Axis a = new Axis();
//		
//		System.out.println(s.rate());
//		System.out.println(i.rate());
//		System.out.println(a.rate());
		
	}
}
