
package com.task1;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ReadOnlySet {

	public static void main(String[] args) {
		TreeSet <Integer> ts=new TreeSet<>();
		ts.add(50);
		ts.add(10);
		ts.add(30);
		ts.add(20);
		ts.add(10);
		System.out.println(ts);
		
		Set<Integer> readOnlySet=Collections.unmodifiableSet(ts);
		System.out.println("read only set "+readOnlySet);
		
		try {
			readOnlySet.add(90);
		}catch(Exception e){
			System.out.println("handled ");
			
		}
		

	}
	

}
