package com.a146;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx 
{
	
	public static void main(String[] args) throws IOException
	{
		
		Student s1 = new Student(101,1234);
		FileOutputStream fout = new FileOutputStream("E://vivek.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);//serialize
		out.writeObject(s1);
		System.out.println("success");
		
		
	}
	
}
