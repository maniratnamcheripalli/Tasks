package com.task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Convert {

	public static void main(String[] args) throws IOException {
		File file=new File("Csv.csv");
		file.createNewFile();
		PrintWriter pw=new PrintWriter("D:\\Mani\\Tasks from confluence\\Collections\\Files\\Excel.XLS");
		BufferedReader br=new BufferedReader(new FileReader(file));
		String i;
		while((i=br.readLine())!=null) {
			pw.println(i);
		}
		pw.flush();
		pw.close();
		br.close();	
	}

}
