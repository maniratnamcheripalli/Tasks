package com.task8;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//8. Write a program to iterate TreeMap in java?
import java.util.TreeMap;

public class IterateTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer,String> tmap=new TreeMap<>();
		tmap.put(1,"Mani");
		tmap.put(4,"famous");
		tmap.put(2,"actor");
		tmap.put(3,"hero");
		System.out.println(tmap);
		// 1st method
		Set<Integer> set=tmap.keySet();
		for(Integer in:set) {
			System.out.println("key is "+in+" and value is "+tmap.get(in));
		}
		//2nd method 
		
		for(Map.Entry<Integer, String> ent:tmap.entrySet()) {
			System.out.println("key is "+ent.getKey()+" and value is "+ent.getValue());	
			
		}
		//3rd method 
		
		 Iterator ite=tmap.entrySet().iterator();
		 while(ite.hasNext()) {
			 System.out.println(ite.next());
		 }


	}

}
