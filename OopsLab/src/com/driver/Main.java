package com.driver;

import java.util.Scanner;

import com.departments.Employee;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter First Name:");
		String name=sc.nextLine();
		
		System.out.println("enter Last Name:");
		String lname=sc.nextLine();
		
		//Object create for employee class
		Employee employee =new Employee(name,lname);
		
		
		System.out.println("Please enter department from the following ");
		System.out.println("1. Technical " );
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		
		int a=sc.nextInt();

		switch(a){
			case 1:{
				employee.techDepartment();
				break;
			}
			case 2:
				employee.admin();
				break;
			case 3:
				employee.humanResources();
				break;
			case 4:
				employee.legal();
				break;
			default :
				System.out.println("Enter valid number");
		}
		
		sc.close();
	}
}