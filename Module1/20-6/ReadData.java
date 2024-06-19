package com.a206;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadData 
{
	public static void main(String[] args) 
	{
		
		try 
		{
			FileInputStream in = new FileInputStream("E://vivek.txt");
			int i =0;
			
			while((i=in.read())!=-1)
			{
				System.out.print((char)i);
			}
			
		
		}
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ArithmeticException e) 
		{
			System.out.println(e);
			e.printStackTrace();
		}
		
	}
}
