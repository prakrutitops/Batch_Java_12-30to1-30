package com.example.demo.exception;

public class ResourceNotFoundException extends RuntimeException 
{
	
	String resource;
	String resourceId;
	long id;
	
	public ResourceNotFoundException(String resource, String resourceId, long id) 
	{
		super(String.format("%s is not found with %s : %s",resource,resourceId,id));
		this.resource=resource;
		this.resourceId=resourceId;
		this.id = id;
	}
}
