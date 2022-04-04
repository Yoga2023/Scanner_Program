package com.emplyoee.details;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {

		Scanner ed= new Scanner(System.in);

		/*
		 * empId name email phoneNum salary gender city
		 */
		
		System.out.println("Employee ID: ");
		ed.nextInt();
		
		
		System.out.println("EMP name:");
		ed.next();
		
		
		System.out.println("EMP Email: ");
		ed.next();
		
	
		System.out.println("EMP Mob no: ");
		ed.nextLong();
		
		
		System.out.println("EMP salary: ");
		ed.nextFloat();
		
		
		System.out.println("EMP Gender: ");
		ed.next();
		
		
		System.out.println("EMP Address");
		System.out.println(ed.next());
	}

}
