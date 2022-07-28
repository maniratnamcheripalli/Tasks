package com.task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainEmp {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp name and id");
		String name=sc.nextLine();
		int id=sc.nextInt();
		Employee ob=new Employee(name,id);
		
		File file=new File("Task2.txt");
		file.createNewFile();
		PrintWriter pw=new PrintWriter(new FileWriter(file));
		pw.println(name);
		pw.println(id);
		pw.close();
		file.setReadOnly();		
	}

}
