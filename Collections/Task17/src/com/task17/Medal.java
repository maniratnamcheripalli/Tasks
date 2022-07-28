package com.task17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class Medal {
	public static void main(String[] args) {
		HashMap<Integer,Float> medal=new HashMap<>();
		HashMap<Integer,String> medal1=new HashMap<>();
		medal.put(10,81.5f);
		medal.put(12,92f);
		medal.put(13,70f);
		medal.put(14,75.2f);
		medal.put(19,86f);
		medal.put(18,95f);
		medal.put(16,86f);
		medal.put(11,75f);
		medal.put(5,74f);
		medal.put(3,74.56f);
		
		for(Entry<Integer, Float> it:medal.entrySet()) {
			if(it.getValue()>=90) {
				medal1.put(it.getKey(), "Gold");
			}
			else if(it.getValue()>=80 && it.getValue()<=90) {
				medal1.put(it.getKey(), "Silver");

			}else {
				medal1.put(it.getKey(), "Bronze");
			}	
			
		}
		System.out.println(medal1);
//		ArrayList<Entry<Integer,String>> list=new ArrayList<>(medal1.entrySet());
//		Collections.sort(list, new Comparator<Entry<Integer,String>>(){
//
//			@Override
//			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
//				return o1.getValue().compareTo(o2.getValue());
//			}
//			
//		});
//		System.out.println(list);
//		
		

		
		
		
		
	}

}
