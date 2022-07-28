package com.practise.task;

import java.util.Scanner;

public class Triangle extends Shape  {
	static int base,height;
	public void area(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base and height of triangle");
		 base=sc.nextInt();
		 height=sc.nextInt();
		System.out.println ("Area of triangle  "+(base*height)/2);
	}
	public void perimeter() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter breadth of triangle");
		int breadth=sc.nextInt();
		System.out.println("Perimeter of triangle  "+ ( base*breadth*height));
	}
}
