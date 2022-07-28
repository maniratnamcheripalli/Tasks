package com.task16;

import java.util.HashMap;
import java.util.Set;

public class PassFail {

	public static void main(String[] args) {
		HashMap<String,Float> map=new HashMap<>();
		HashMap<String,String> map1=new HashMap<>();
		map.put("selva",75.6f);
		map.put("abi",89.5f);
		map.put("ram", 40f);
		
		Set<String> se=map.keySet();
		for(String it:se) {
			if(map.get(it)>60) {
				map1.put(it,"pass");
			}
			else {
				map1.put(it,"fail");
			}
		}
		System.out.println(map1);


	}

}
