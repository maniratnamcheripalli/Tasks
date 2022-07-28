package com.practise.cell;

import java.util.Scanner;

public class Cell extends CellPhone {
	/*@Override
	void run() {
		//super.run();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of phone numbers that you want to input");
		int n=sc.nextInt();
		long[] h=new long[n];
		for(int i=0;i<n;i++) {
			int c=i+1;
			System.out.println("enter your phone numbers "+c);
			h[i]=sc.nextLong();
			}
		System.out.println("Your phone numbers are");
		for(long de:h) {
			System.out.println(de+" ");
		}	*/
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter no of phone numbers that you want to input");
		int n=sc.nextInt();
		CellPhone ob=new CellPhone();
		
		if(n==1) {
			
			System.out.println("enter your phone numbers ");
			long num1=sc.nextLong();
			ob.fun(name, num1);
		}
		else if(n==2) {
			System.out.println("enter your phone numbers ");
			long num1=sc.nextLong();
			long num2=sc.nextLong();
			ob.fun(name, num1, num2);
			
		}
		else {
			System.out.print("out of limit");
		}
		

	}

}
