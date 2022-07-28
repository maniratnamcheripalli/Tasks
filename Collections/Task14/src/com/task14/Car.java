package com.task14;

import java.util.Scanner;

public class Car {
	
	public static void main(String[] args) {
		Scanner sa=new Scanner(System.in);
		for(int i=1;i<5;i++) {
			System.out.println("enter your choice 1: Hyundai 2: Benz");
			int b=sa.nextInt();
			switch(b) {
			case 1:
				System.out.println("You selected Hyundai");
				HyundaiCar.hyundai();
				break;
			case 2:
				System.out.println("You selected Benz");
				 BenzCar.benz();
			default :
				System.out.println("enter in between 1-3");
			}
		}
	
	}
}

