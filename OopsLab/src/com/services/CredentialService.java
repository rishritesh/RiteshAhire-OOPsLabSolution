package com.services;

import java.util.Random;

import com.model.Employee;

public class CredentialService {
	

	public String createEmail( String firstName, String lastName,String departmentName)
	{
		
		return  firstName+lastName+"@"+departmentName+".abc.com";
		
		
	}

	public String createPassword() 
	{
		String capital="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small="abcdefghijklmnopqrstuvwxyz";
		String num="0123456789";
		String special="*&^%$#@!?<>)(";
		
		String combination=num+capital+small+special;
		int len=8;
		
		char[] password = new char[len];
		Random r =new Random();
		
		for(int i=0;i<len;i++) {
			password[i]=combination.charAt(r.nextInt(combination.length()));
		}
		
		return new String (password);
		
	}
	
	public void showCredentials(Employee employee,String generatedEmail,String generatedPassword){
		System.out.println("Dear "+employee.firstName+" Your generated credentials are as follows");
		System.out.println("Email--> "+generatedEmail);
		System.out.println("Password-->"+generatedPassword);
		}
}


	



	


	




