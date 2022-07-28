package com.task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Employee {
	void create() throws IOException {
		File file=new File("Task.txt");
		file.createNewFile();
		System.out.println("File Successfuly Created");
	}
	
	void write() throws IOException {
		PrintWriter pw=new PrintWriter("Task.txt");
		pw.println("Emp: Mani");
		pw.println("Id: 1955");
		pw.println(100);
		pw.write(100);
		pw.flush();
		pw.close();	
	}
	void read() throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("Task.txt"));
		String i;
		while((i=br.readLine())!=null) {
			System.out.println(i);
		}
		br.close();
		
		
	}
	


}
