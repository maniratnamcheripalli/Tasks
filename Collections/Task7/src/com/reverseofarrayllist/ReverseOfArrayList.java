
package com.reverseofarrayllist;
// Write a program to reverse ArrayList in java

import java.util.ArrayList;
import java.util.Collections;

public class ReverseOfArrayList {

	public static void main(String[] args) {
		ArrayList <Integer> num=new ArrayList<Integer>();
		num.add(10);
		num.add(30);
		num.add(40);
		num.add(20);
		num.add(50);
		System.out.println("ArrayList   "+num);
		Collections.reverse(num);
		System.out.println("Reversed ArrayList  "+num);
	}

}
