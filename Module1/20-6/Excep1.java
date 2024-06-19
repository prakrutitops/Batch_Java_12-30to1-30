package com.a206;

import java.util.Scanner;

public class Excep1 
{
	int deposit, withdraw;
	private int balance = 2000;
	
	void deposite(int amount)
	{
		balance+=amount;
	}
	
	void withdraw(int amount) throws InSufficientFundException
	{
		if(amount>balance)
		{
			throw new InSufficientFundException(String.format("Sorry, insufficient balance, you need more %d Rs.\nTo perform "
					+ "this transaction",(amount-balance)));
		}
		else
		{
			balance-=amount;
			System.out.println("Balance: "+balance);
		}
	}
	
	
	public static void main(String[] args) throws InSufficientFundException 
	{
		Excep1 e1 = new Excep1();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Amount");
		int a = sc.nextInt();
		//e1.deposite(0);
		e1.withdraw(a);
		
	}
}
