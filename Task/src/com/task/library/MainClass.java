package com.task.library;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		ArrayList<Library> list=new ArrayList<>();
		Admin ad=new Admin();
		Viewer view=new Viewer();
		int i=0;
		while(true) {
			System.out.println("Enter whether you are admin or viewer");
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			if(s.equals("admin")) {
				System.out.println("Enter username and password");
				String un=sc.next();
				int pa=sc.nextInt();
				
				if(un.equals("admin")&& pa==123)
				{
					ad.adding(list);
				}
				else {
					System.out.println("Enter valid login details");
				}
				
			}else {
				view.viewer(list);
				break;
			}
		}
	}

}
