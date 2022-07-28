package com.task6;

import java.util.HashSet;

//  Write a program to convert HashSet to Array?

public class HashsetToArray {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(10);
		hs.add(30);
		hs.add(60);
		hs.add(80);
		System.out.println(hs);
		Integer integer[]=new Integer [hs.size()];
		Integer integer1[]=new Integer [hs.size()];
		// 1st way
		int i=0;
		for(Integer be:hs) {
			integer[i++]=be;
		}
		System.out.println("Ist way of converted array ");
		for(int j=0;j<hs.size();j++) {
			System.out.println(integer[j]);
		}
		// 2nd way
		System.out.println("2nd way of converted array ");
		hs.toArray(integer1);
		for(Integer arr:integer1) {
			System.out.print(arr+" ");
		}

	}

}
