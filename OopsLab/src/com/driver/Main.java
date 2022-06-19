package com.driver;

import java.util.Scanner;

import com.model.Employee;
import com.services.CredentialService;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner (System.in);
		

		//Object create for employee class
		Employee employee =new Employee("Rish","ahire");
		String	generatedEmail;
		String generatedPassword;
		
		//Object create for credential class 
		CredentialService credentialService =new CredentialService();
		
		
		System.out.println("Please enter department from the following ");
		System.out.println("1. Technical " );
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		
		int a=sc.nextInt();

		switch(a){
			case 1:
			{
				generatedEmail=credentialService.createEmail(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "tech");
				generatedPassword=credentialService.createPassword();
				credentialService.showCredentials(employee,generatedEmail,generatedPassword);
				break;
			}
			case 2:
				generatedEmail=credentialService.createEmail(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "admin");
				generatedPassword=credentialService.createPassword();
				credentialService.showCredentials(employee,generatedEmail,generatedPassword);
				break;
			case 3:
				generatedEmail=credentialService.createEmail(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "hr");
				generatedPassword=credentialService.createPassword();
				credentialService.showCredentials(employee,generatedEmail,generatedPassword);
				break;
			case 4:
				generatedEmail=credentialService.createEmail(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "legal");
				generatedPassword=credentialService.createPassword();
				credentialService.showCredentials(employee,generatedEmail,generatedPassword);
				break;
			default :
				System.out.println("Enter valid number");
		}
		
		sc.close();
	}
}