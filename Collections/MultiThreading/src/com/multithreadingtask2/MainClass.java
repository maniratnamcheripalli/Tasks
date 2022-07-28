package com.multithreadingtask2;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws InterruptedException{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		Add ad=new Add(a,b);
		Avg av=new Avg(a,b);
		Display d=new Display();
		ad.start();
		av.start();
		av.join();
		d.start();
	}

}
