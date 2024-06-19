package com.a206;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterEx 
{
	public static void main(String[] args) throws IOException 
	{
		
		FileWriter fw = new FileWriter("E://tops1.txt");
		String s = "Hello , this is my data";
		fw.write(s);
		fw.flush();
		fw.close();
		
		System.out.println("Executed");

		FileReader fr = new FileReader("E://tops1.txt");
		int i=0;
	
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
	}
}
