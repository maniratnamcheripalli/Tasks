package com.task1;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class ReadOnlyMap {

	public static void main(String[] args) {
	
		TreeMap<Integer,Integer> tm=new TreeMap<>();
		tm.put(1, 10);
		tm.put(5, 80);
		tm.put(2, 30);
		tm.put(3, 90);
		tm.put(5, 60);
		System.out.println(tm);
		
		Map<Integer,Integer> readOnlyMap= Collections.unmodifiableMap(tm);
		try {
			readOnlyMap.put(8, 10);
		}catch(Exception e) {
			System.out.println("Handled");
		}

	}

}
