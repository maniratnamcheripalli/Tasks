package com.task15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		HashMap<Integer,String> bike=new HashMap<>();
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> all=new ArrayList<>();
		for(int i=1;i<=15;i++) {
			bike.put(i, "B1");
		}
		HashMap<Integer,String> car=new HashMap<>();
		for(int j=1;j<=15;j++) {
			car.put(j, "B2");
		}
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter 1 for bike 2: for car ");
			int k=sc.nextInt();
			if(k==1) {
				System.out.println("Enter your last four digit of vechile no ");
				int m=sc.nextInt();
				if(al.contains(m)) {
					System.out.println("already slot is allocated for this vechile number");
					
				}else {
					al.add(m);
					System.out.println("Available slots arein B1 ");
					for(Map.Entry ent:bike.entrySet()) {
						System.out.print(ent.getKey()+"  ");
					}
					System.out.println("Enter the slot");
					int l=sc.nextInt();
					if(bike.containsKey(l)) {
						System.out.println("Your slot is allocated and no is   "+l);
						bike.remove(l);
					}
					else {
						System.out.println("Please enter the available slot no from list");
						
						}
				}
				
			}
			else if(k==2) {
				System.out.println("Enter your last four digit of vechile no ");
				int m=sc.nextInt();
				if(all.contains(m)) {
					System.out.println("already slot is allocated for this vechile number");
					
				}else {
					all.add(m);
					System.out.println("Available slots are ");
					for(Map.Entry ent:car.entrySet()) {
						System.out.println(ent.getKey()+"   "+ent.getValue());
					}
					System.out.println("Enter the slot");
					int l=sc.nextInt();
					if(l<=30) {
						System.out.println("Your slot is allocated and no is   "+l);
						car.remove(l);
					}
					else {
						System.out.println("Please enter the available slot no from list");
						}
			}
				}
			else {
				break;
			}
		}
		

	}

}
