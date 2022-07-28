package com.task18;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	void array() {
		Scanner sc=new Scanner(System.in);
		Scanner va=new Scanner(System.in);
		System.out.println("Enter size of array");
		int b=sc.nextInt();
		String a[]=new String[b];
		for(int i=0;i<b;i++) {
			System.out.println("Enter"+i+" String elements");
			a[i]=va.nextLine();
		}
		Arrays.sort(a);
		int c;
		if(b%2==0) {
			c=b/2;
		}
		else {
			c=(b/2)+1;
		}
		for(int j=0;j<b;j++) {
			if(j<c) {
				a[j]=a[j].toUpperCase();
			}
			else {
				a[j]=a[j].toLowerCase();
			}
		}
		for(int j=0;j<b;j++) {
			System.out.println(a[j]);
		}
		
		
		
		
		
		
	}
	
	
	
	
	

}
