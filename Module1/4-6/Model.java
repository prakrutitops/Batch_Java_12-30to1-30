package com.a46;

//set & get
public class Model 
{
	String fname;
	String lname;
	String email;
	String pass;
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
}
