package com.task.library;

import java.util.ArrayList;
import java.util.Scanner;



public class Admin {
	public void adding(ArrayList<Library> list2) {

		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Do u want to enter data");
			if(sc.next().equals("yes")) {
				System.out.println("enter book name and autor name");
				String name=sc.next();
				String author=sc.next();
				Library l=new Library(name,author);
				list2.add(l);
			}else 
			{
				break;
			}
		}
		System.out.println(list2);
		
		
	}


}
