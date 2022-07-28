package com.task9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

//Write a program to sort HashMap by value

public class SortHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"Mani");
		hm.put(4,"Famous");
		hm.put(2,"Actor");
		hm.put(3,"Hero");
		
		// Sorted by keys
		TreeMap<Integer,String> tree=new TreeMap<>(hm);
		for(Map.Entry ent:tree.entrySet() ) {
			System.out.println(ent.getKey()+"\t"+ent.getValue());
		}
		
		//sorted by values
		
		List<Entry<Integer,String>> list=new ArrayList<Entry<Integer,String>>(hm.entrySet());
		Collections.sort(list,new Comparator<Entry<Integer,String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
			
				return o1.getValue().compareTo(o2.getValue());
			}
		});	
		
		
		System.out.println("Sorted based on values  ");
		for(Map.Entry<Integer,String> e:list){
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
		
		
		


	}

}

