package com.a206;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx1 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		String s ="welcome";
		FileOutputStream fout = new FileOutputStream("E://disha.txt");
		fout.write(s.getBytes());
		System.out.println("Success");
	
		
		Thread.sleep(5000);
		
		FileInputStream fin = new FileInputStream("E://disha.txt");
		int i=0;
		while((i=fin.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		
	}
}
