package com.departments;

import com.services.Email;
import com.services.Password;

public class Employee {
	
	public String firstName;
	public String Lastname;
	
	public Employee() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(String firstName, String lastname) 
	{
		this.firstName = firstName;
		this.Lastname  = lastname;
	}
		
	
	//Object create for email services
	Email email =new Email();
	
	//Object create for password
	Password password =new Password();	
	
	
	// create method for technical department
	public void techDepartment()
	{
		System.out.println("Dear "+firstName+" Your generated credentials are as follows");
		email.createEmail(firstName,Lastname,"tech");
		password.createPassword();
		
	}
	

	// create method for Admin department
	public void admin() 
	{
		System.out.println("Dear "+firstName+" Your generated credentials are as follows");
		email.createEmail(firstName,Lastname,"admin");
		password.createPassword();
	}
	
	// create method for Human Resources department
	public void humanResources() 
	{
		System.out.println("Dear "+firstName+" Your generated credentials are as follows");
		email.createEmail(firstName,Lastname,"humanResources");
		password.createPassword();
	}
	
	//create method for Legal department
	public void legal() 
	{
	
		System.out.println("Dear "+firstName+" Your generated credentials are as follows");
		email.createEmail(firstName, Lastname, "legal");
		password.createPassword();
	}

}
