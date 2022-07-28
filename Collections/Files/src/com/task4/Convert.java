package com.task4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Convert {
	public static void main(String[] args) throws IOException {
		File file=new File("D:\\Mani\\Tasks from confluence\\Collections\\Files\\Excel.XLS");
		BufferedReader br=new BufferedReader(new FileReader(file));
		PrintWriter pw=new PrintWriter("ExelToCsv.csv");
		String i;
		while((i=br.readLine())!=null) {
			pw.println(i);
		}
		pw.flush();
		pw.close();
		br.close();	
	}

}
