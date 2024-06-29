package com.a296;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx 
{
	public static void main(String[] args) 
	{
		LinkedList list =  new LinkedList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("A");
		
		LinkedList list2 =  new LinkedList<>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		list2.add("A");
		
		list.addAll(list2);
		//remove,removeAll,retainAll
		
		list.addFirst("T");
		list.addLast("S");
		
		Iterator i = list.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
