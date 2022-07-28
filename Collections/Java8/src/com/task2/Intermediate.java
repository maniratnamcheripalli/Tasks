package com.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//What are the most commonly used Intermediate operations? give an example for 1.distinct() 2.limit() 3.skip() 4. peek() 5.flatMap()
public class Intermediate {
	public static void main(String[] args) {
	
		List<Integer> lie=Arrays.asList(150,152,160);
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(60);
		list.add(80);
		list.add(15);
		list.add(30);
		list.add(60);
		list.add(80);
		list.add(15);
		List<Integer> li=list.stream().distinct().collect(Collectors.toList());
		System.out.println("distinct "+ li);
		List<Integer> l=list.stream().skip(3).collect(Collectors.toList());
		System.out.println("Skip  "+l);
		list.stream().distinct().peek(p->System.out.println(p)).collect(Collectors.toList());	
		System.out.println("*****flatMap*****");
		List<List<Integer>> integer= Arrays.asList(list,lie);
		System.out.println(integer);
		List<Integer> finalized=integer.stream().flatMap(q->q.stream()).collect(Collectors.toList());
		System.out.println("Finalized "+finalized);
	}

}
