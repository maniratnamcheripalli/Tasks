package com.task14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HyundaiCar {
	static int z=8;
	static int y=7;
	static int w=5;
	static void hyundai() {
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("creta",z);
		hm.put("venue",y);
		hm.put("santro",w);
		System.out.println("enter 1-for creta 2- for venue 3-for santro");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("Booked creta");
			z=z-1;
			hm.replace("creta", z);
			System.out.println("current count of car is "+hm.get("creta"));
			break;
		case 2:
			System.out.println("selected venue");
			y=y-1;
			hm.replace("venue", y);
			System.out.println("current count of car is "+hm.get("venue"));
			break;
		case 3:
			System.out.println("selected santro");
			w=w-1;
			hm.replace("creta", w);
			System.out.println("current count of car is "+hm.get("santro"));
			break;
		default:
			System.out.println();
		
		
		}	
	}

}
