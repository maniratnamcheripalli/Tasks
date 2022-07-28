package com.task5;

import java.util.ArrayList;
import java.util.LinkedList;

// Write a program to convert LinkedList to ArrayList

public class Task {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(50);
		ll.add(2,10);
		ll.add(30);
		ll.add(60);
		System.out.println(ll);
		  // 1st way
		ArrayList<Integer> array=new ArrayList<>(ll);
		System.out.println("Converted linked list to array list 1st way  "+array);
		 // 2nd way
		ArrayList<Integer> array1=new ArrayList<>();
		array1.addAll(ll);
		System.out.println("Converted linked list to array list 2nd way  "+array1);


	}

}
