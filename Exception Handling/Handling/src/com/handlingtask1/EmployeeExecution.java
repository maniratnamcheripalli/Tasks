package com.handling;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeExecution {

	static ArrayList<Pojo> list = new ArrayList<Pojo>();
	public static void empid(int a) throws EmpIdNotFound {
		int c = 0;
		Pojo e1 = new Pojo(1, "raju", "HYD");
		list.add(e1);
		Pojo e2 = new Pojo(2, "sam", "BEG");
		list.add(e2);
		Pojo e3 = new Pojo(3, "rani", "MUB");
		list.add(e3);
		for (Pojo employee : list) {
			if (employee.getId() == a) {
				c++;
			}
		}
		if (c == 1) {
			System.out.println("Welcome to office");
		} else {
			throw new EmpIdNotFound("given Employee ID is not found or mismatched ,please enter the valid ID");
		}

	}

}