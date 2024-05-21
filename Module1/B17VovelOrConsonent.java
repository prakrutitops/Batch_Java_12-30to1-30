package assignment;

import java.util.Scanner;

public class B17VovelOrConsonent 
{
	char sW;
	
	public B17VovelOrConsonent() 
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any single alphabet to check Voles or Consonant: ");
		sW = sc.next();
			
		a
		
		if(sW.length()>1)
		{
			System.out.println("Enter only single character");
		}
		else if(!(sW <= 'a' && sW >='z') || (sW <= 'A' && sW >='Z'))
		{
			System.out.println("It's not a characters");
		}
		
		else if(sW == 'a' || sW == 'e' || sW == 'i' || sW == 'o' || sW == 'u')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("Its a Consonant");
		}

	
	}
	public static void main(String[] args) 
	{
		new B17VovelOrConsonent();
		
		
	}
}
