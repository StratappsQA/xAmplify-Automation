package com.xamplify.automation;

//Java class file to get&set email,firstname and last name
public class ProductModel 
{
	private String email;
	private String firstname;
	private String lastname;

	public ProductModel(String email, String firstname, String lastname )
	{
		this.email=email;
		this.firstname=firstname;
		this.lastname=lastname;		
	}	

	//email field
	public String getEmail() 
	{
		return email;		
	}	
	public void setEmail(String email) 
	{
		this.email=email;	
	}

	//firstname field
	public String getFirstname() 
	{
		return firstname;		
	}

	public void setFirstname(String firstname) 
	{
		this.firstname=firstname;	
	}

	//lastname field
	public String getLastname() 
	{
		return lastname;		
	}	
	public void setLastname(String lastname) 
	{
		this.lastname=lastname;	
	}

}

