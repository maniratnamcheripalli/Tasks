package com.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

//What are the Terminal operations? give an example for 1.collect() 2.reduce() 3. anyMatch() , noneMatch() , allMatch() 4. forEach() 5.forEachOrdered()
public class Terminal {

	public static void main(String[] args) {
		List<StudentDetails> list=new ArrayList<StudentDetails>();
		list.add(new StudentDetails(1,"Vinay",80.2f));
		list.add(new StudentDetails(2,"Rahul",60.0f));
		list.add(new StudentDetails(8,"Srikanth",90f));
		list.add(new StudentDetails(4,"Ragavendhra",60f));
		list.add(new StudentDetails(3,"Athar",80f));
		
		Set<Integer> set=list.stream().map(p->p.getId()).collect(Collectors.toSet());
		System.out.println("Id of students "+set);
		Map<Object, Object> map=list.stream().collect(Collectors.toMap(p->p.getId(),p->p.getName()));
		System.out.println(map);
		float f=list.stream().count();
		System.out.println(f);
		
		boolean q=list.stream().allMatch(p->p.getMarks()>50);
		System.out.println("allMatch "+q);
		boolean r=list.stream().anyMatch(p->p.getMarks()>50);
		System.out.println("anyMatch "+r);
		System.out.println("noneMatch "+list.stream().noneMatch(p->p.getMarks()>50));
		System.out.println("Reduce "+set.stream().reduce(0,(p,s)-> p+s));
		System.out.println("*****Names******");
		list.stream().map(p->p.getName()).parallel().forEach(System.out::println);
		System.out.println("*****Names******");
		list.stream().map(p->p.getName()).parallel().forEachOrdered(System.out::println);
	}

}
