package com.arraylist;

import java.util.ArrayList;

public class ArrayListToArray {
	public static void main(String[] args) {
	ArrayList <String> list=new ArrayList<String>();
	list.add("Mani");
	list.add("Mani");
	list.add(2,"Ninja");
	System.out.println(list);
	
	// 1st method
	
	String arr[]=new String[list.size()];
	list.toArray(arr);
	for(String object:arr) {
		System.out.println(object);
	}
	
	//2nd method
	
	String arr2[]=new String[list.size()];
	for(int i=0;i<list.size();i++) {
		arr2[i]=list.get(i);
	}
	for(String st:arr2) {
		System.out.print(st+" ");
	}
	
	//3rd method 
	
	String arr3[]=new String[list.size()];
	arr3=list.toArray(arr3);
	for(String object:arr3) {
		System.out.printf("\n"+object+" ");
	}
	

}
}
