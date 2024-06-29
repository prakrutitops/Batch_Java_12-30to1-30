package com.a296;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetEx2 
{
	public static void main(String[] args) 
	{
		LinkedHashSet list =  new LinkedHashSet<>();
		
		list.add("Akash");
		list.add("Brijesh");
		list.add("Chintan");
		list.add("Dhyey");
		list.add("Akash");
	
		Iterator i = list.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
