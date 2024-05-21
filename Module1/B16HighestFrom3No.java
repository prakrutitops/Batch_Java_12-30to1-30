package assignment;

import java.util.Scanner;

public class B16HighestFrom3No 
{
	public static void main(String[] args) 
	{
		int num1, num2, num3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		num2 = sc.nextInt();
		System.out.println("Enter Third Number");
		num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3)
		{
			System.out.println("Number First is Highest:" + num1);
		}
		else if (num2 > num1 && num2 > num3)
		{
			System.out.println("Number Second is Highest:" + num2);
		}
		else if (num3 > num1 && num3 > num2)
			System.out.println("Number Third is Highest:" + num3);
		
	}
}
