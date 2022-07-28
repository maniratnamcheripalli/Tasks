package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {
	public static void main(String[] args) {
		// 1st method
		
		String [] array= {"Ramu","Shamu","Raju","Vinay","Yeashwanth"};
		ArrayList <String> arr=new ArrayList<String>();
		Collections.addAll(arr, array);
		System.out.println(arr);
		
		
		//2nd method
		
		String [] array1= {"Ramu","Shamu","Raju","Vinay","Yeashwanth"};
		List al=Arrays.asList(array1);
		System.out.println(al);
		
		//3rd method
		String [] array3= {"Ramu","Shamu","Raju","Vinay","Yeashwanth"};
		ArrayList <String> arr1=new ArrayList<String>();
		
		for(String st:array3) {
			arr1.add(st);
		}
		System.out.println(arr1);

	}


}
