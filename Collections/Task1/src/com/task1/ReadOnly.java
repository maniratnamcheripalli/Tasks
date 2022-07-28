package com.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnly {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(220);
		list.add(1,30);
		list.add(180);
		System.out.println(list);
		List<Integer> readOnlyList=Collections.unmodifiableList(list);
		System.out.println("read only list "+readOnlyList);
		
		try {
			readOnlyList.add(10);
		}catch(Exception e) {
			System.out.println("Handled");
		}
	}

}
