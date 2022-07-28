package com.task20;

import java.util.HashMap;
import java.util.Scanner;

public class Delimeter {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		HashMap<String,String> hm=new HashMap<>();
		System.out.println("Enter String");
		String s=sc.nextLine();
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i+=2) {
			hm.put(a[i], a[i+1]);
		}
		System.out.println(hm);

	}
}
