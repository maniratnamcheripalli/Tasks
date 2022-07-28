package com.Task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.TreeSet;

public class ArrayListTask {

	public static void main(String[] args) {
		
		ArrayList <Integer> al=new ArrayList<>();
		ArrayList <String> list=new ArrayList<>();
		list.add("ManiRatnam");  
		list.add("Rajesh");
		list.add(1,"Rahul");
		list.add("Yeashwanth");
		list.add("Touseff");
		list.add("Arun");
		//al.add(null);
		al.add(10);
		al.add(20);
		al.add(50);
		//al.add(2, null); 
		al.add(3, 20);// b) Array list add element at specific index
		al.add(80);
		System.out.println(al);
		
		//a)How to Iterate ArrayList using Java ListIterator
		
		
		ListIterator<Integer> it= al.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		 // c) Sort ArrayList in descending order
		// f) Sort elements of Java ArrayList
		Collections.sort(al);                 
		System.out.println("Sorted in ascending "+al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Sorted in descending "+al);
		
		// d)insert an element to ArrayList using ListIterator
		ListIterator<Integer> it1= al.listIterator();
		while(it1.hasNext()) {
			it1.add(90);
			it1.add(60);
			it1.next();
		}
		System.out.println("after adding "+al);
		
		
		// e)sort arraylist of strings alphabetically java
		System.out.println("Before sorting "+list);
		Collections.sort(list);
		System.out.println("After sorting  "+list);
		
		// Search an element of Java ArrayList
		System.out.println("Search for an element  "+list.contains("Rajesh"));
		
		//Remove element from specified index ArrayList
		
		list.remove(2);
		al.remove(2);
		System.out.println("Element after removing  "+list+"   "+al  );
		
		
		  // j)Remove duplicates from array list  using collections
		
		TreeSet<Integer> ts=new TreeSet<>();
		ts.addAll(al);
		System.out.println("before removing Duplicates "+al);
		al.clear();
		al.addAll(ts);
		System.out.println("After removing duplicates "+al);
		
		
		
		
		

		
	}

}
