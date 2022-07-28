package com.task3;

public class User {

	public static void main(String[] args) {
		try {
			marks(20);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
	public static void marks(int nu)throws LessMarks {
		if(nu<30) {
			throw new LessMarks("Failed");
		}
		else {
			System.out.println("Passed A grade");
		}
	}

}
