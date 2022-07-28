package com.task14;

import java.util.HashMap;
import java.util.Scanner;

public class BenzCar {
	static int z=8;
	static int y=7;
	static int w=5;
	static void benz() {
		HashMap<String,Integer> hm1=new HashMap<String,Integer>();
		hm1.put("Benz A- Class",8);
		hm1.put("Benz AMG",7);
		hm1.put("Benz EQC",5);
		System.out.println("enter 1-for Benz A- Class 2- for Benz AMG 3-for Benz EQC");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("Your  Benz  car is booked");
			z=z-1;
			hm1.replace("Benz A- Class", z);
			System.out.println("current count of car is "+hm1.get("Benz A- Class"));
			break;
		case 2:
			System.out.println("your Benz AMG is booked");
			y=y-1;;
			hm1.replace("Benz AMG", y);
			System.out.println("current count of car is "+hm1.get("Benz AMG"));
			break;
		case 3:
			System.out.println("your Benz EQC is booked");
			w=w-1;
			hm1.replace("Benz EQC", w);
			System.out.println("current count of car is "+hm1.get("Benz EQC"));
			break;
		default:
			System.out.println();
		
		
		}	
	}

}
