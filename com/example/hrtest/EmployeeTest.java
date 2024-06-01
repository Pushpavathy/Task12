package com.example.hrtest;

import java.util.Scanner;

import com.example.hr.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Enter the Employee name");
		emp.name= sc.next();
		System.out.println("Enter the Employee id");
		emp.id =sc.nextInt();
		System.out.println("Enter the Employee salary");
		emp.Salary = sc.nextDouble();
		emp.printName();
		emp.printSalary();
		

	}

}
