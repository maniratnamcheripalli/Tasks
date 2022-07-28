package com.tsk3;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MultipleCountries {

	public static void main(String[] args) {
		TreeMap<String,String> tm=new TreeMap<>();
		tm.put("Albania","Tirana");
		tm.put("Algeria","Algiers");		
		tm.put("Andorra","Andorra la Vella");
		tm.put("Austria","Vienna");
		tm.put("United States","Washington D.C.");
		
		System.out.println(tm);
		
		
		
		// 1.for each loop
		
		System.out.println("for each loop \n");
		for (Map.Entry<String,String> entry : tm.entrySet()) {
			System.out.println("captial for country "+ entry.getKey() +" is"+ entry.getValue());
			
		}
		
		//2.key set iterator
		
		System.out.println("key set iterator\n");
		//Set<String> keys=tm.keySet();
		for(String key:tm.keySet() ) {
			System.out.println("Captial for country  "+ key +" is "+tm.get(key));
		}
		
		//3.entry set iterator along with for each
		System.out.println("entry set iterator along with for each \n ");	
		tm.entrySet().forEach(
				entry -> System.out.println("entry key -> " + entry.getKey() + ", entry value -> " + entry.getValue()));
		
		//4.EntrySet along with Java iterator
		System.out.println(".EntrySet along with Java iterator\n  ");
		Iterator<Entry<String, String>> it= tm.entrySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		
		

	}

}
