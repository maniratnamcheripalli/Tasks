package com.task;

import java.util.Scanner;

interface A{
	public abstract void square();
}
public class Arithmetic implements A 
{
	public void square() 
	{
	    System.out.println("Enter a int number");
		Scanner cs=new Scanner(System.in);
		int a=cs.nextInt();
		System.out.println("square a number"+ a*a);
	}
	
}
