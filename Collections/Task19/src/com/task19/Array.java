package com.task19;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	void method() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int b=sc.nextInt();
		int a[]=new int[b];
		for(int i=0;i<b;i++) {
			System.out.println("Enter "+i+" elements");
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int temp[]=new int[b];
		int k=0;
		for(int i=0;i<b-1;i++) {
			if (a[i] != a[i+1]) {
					temp[k]=a[i];
					k++;
			}
		}
		temp[k++]=a[b-1];
		System.out.println(k);
		
		for(int j=0;j<k;j++) {
			System.out.println(temp[j]);
		}
		
	}

}
