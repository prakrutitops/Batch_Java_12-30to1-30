package com.a296;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector<>(5);
		
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");
		v.addElement("A");
		v.addElement("A");
		v.addElement("A");
		v.addElement("C");
		v.addElement("A");
		v.addElement("A");
		v.addElement("A");
		v.addElement("A");
		
		System.out.println("Capacity: "+v.capacity());
		System.out.println("Size: "+v.size());
		//System.out.println(v);
		
		System.out.println("----------------------------");
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		//System.out.println(v.);
		
		if(v.contains("A"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		System.out.println("----------------------------");
		
		Iterator i = v.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
