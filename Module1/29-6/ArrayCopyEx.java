package com.a296;

public class ArrayCopyEx 
{
	public static void main(String[] args) 
	{
		int A[]= {1,2,3,4,5};
		int B[] =new int[10];
		
		System.arraycopy(A, 1, B, 2, 4);
		
		for(int i=0;i<B.length;i++)
		{
			System.out.println(B[i]);
		}
		
		
		
		
	}
}
