package com.a206;

public class InSufficientFundException extends Exception
{
	private String message;
	
	public InSufficientFundException(String message) 
	{
		this.message = message;
	}
	
	public InSufficientFundException(Throwable cause,String message) 
	{
		super(cause);
		this.message = message;
	}
	
	public String getMessage()
	{
		return message;
	}
}
