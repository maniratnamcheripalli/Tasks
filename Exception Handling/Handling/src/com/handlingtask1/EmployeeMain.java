package com.handling;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner ha = new Scanner(System.in);
		System.out.println("enter id");
		int id = ha.nextInt();
		EmployeeExecution employeeExecution = new EmployeeExecution();
		try {
			employeeExecution.empid(id);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
