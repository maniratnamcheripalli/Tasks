package com.practise.task;

import java.util.Scanner;

public class Square extends Shape {
	static int side;
	public void area() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter side of square");
		side=sc.nextInt();
		System.out.println("Area of square "+(2*side));
	}
	public void perimeter() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Perimeter of square   "+(4*side));
	}

}
