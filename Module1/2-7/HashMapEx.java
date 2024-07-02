package com.a296;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx 
{	
	public static void main(String[] args) 
	{
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("A", 101);
		map.put("B", 102);
		map.put("C", 103);
		map.put("A", 104);
		
		/*
		 	for(datatype name : data)
		 	{
		 	
		 	}
		 */
		
			for(Map.Entry m : map.entrySet())
			{
				System.out.println(m.getKey());
				System.out.println(m.getValue());
			}
		
	}
}
