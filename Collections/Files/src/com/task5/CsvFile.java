package com.task5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CsvFile {

	public static void main(String[] args){
		
		File file=new File("Task3.csv");
		try {
			file.createNewFile();
			PrintWriter pw=new PrintWriter(new FileWriter(file,true));
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter employ name,role and id");
			String name=sc.nextLine();
			String role=sc.nextLine();
			int id=sc.nextInt();
			pw.println(name+","+role+","+id);
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
