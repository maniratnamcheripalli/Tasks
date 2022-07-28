package com.task1;

import java.io.IOException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws IOException {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter file name ");
//		String filename=sc.nextLine();
		
		Manager ma=new Manager();
		ma.create();
		ma.write();
		ma.read();
		
		

	}

}
