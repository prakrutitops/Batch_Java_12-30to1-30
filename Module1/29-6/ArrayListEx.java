package com.a296;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("Java");
		arrayList.add("Php");
		arrayList.add("Android");
		arrayList.add("Flutter");
		
		ArrayList<String> arrayList2 = new ArrayList<>();
		
		arrayList2.add("Java2");
		arrayList2.add("Php2");
		arrayList2.add("Android2");
		arrayList2.add("Flutter");
		
		//arrayList.addAll(arrayList2);
		//arrayList.remove(1);
		//arrayList.remove("Android2");
		arrayList.removeAll(arrayList2);
		//arrayList.retainAll(arrayList2);
		
		Iterator i = arrayList.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
