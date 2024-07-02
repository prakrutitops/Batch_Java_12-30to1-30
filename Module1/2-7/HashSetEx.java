package com.a296;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx 
{
	public static void main(String[] args)
	{
		
		HashSet set = new HashSet<>();
		
		set.add("Akash");
		set.add("Dhyey");
		set.add("Brijesh");
		set.add("Farook");
		
		//0XC123323//hashvalue//asc
		
		Iterator i = set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		
	}
}
