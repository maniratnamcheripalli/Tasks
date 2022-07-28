package com.task9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Sort {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
		  hm.put("Mani", 10);
          hm.put("Hero",15);
          hm.put("Famous",20);
          hm.put("Actor", 11);
          System.out.println(hm);
          List<Map.Entry<String,Integer>> list=new ArrayList<>(hm.entrySet());
          Collections.sort(list, new Comparator<Map.Entry<String,Integer>>(){
        	  
          public int compare(Map.Entry<String, Integer> e1,Map.Entry<String,Integer>e2) {
                 return e1.getValue().compareTo(e2.getValue());

              }
          });

          for(Map.Entry<String, Integer> e:list) {
              System.out.println(e.getKey()+" "+e.getValue());
          }
 
          
          
	

	}

}
