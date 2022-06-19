package com.model;


public class Employee {
	
	public String firstName;
	public String LastName;
	
	public Employee() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String firstName, String lastname) 
	{
		this.firstName = firstName;
		this.LastName  = lastname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
		
	
	

}
