package com.books;

import java.util.List;
import java.util.Scanner;

public class MainClass {
	
	public static Books getBook() {
		Scanner sc=new Scanner(System.in);
		Books b1=new Books();
		System.out.println("enter author name");
		b1.setAuthor(sc.nextLine());
		System.out.println("enter book name");
		b1.setBookname(sc.nextLine());
		System.out.println("enter quantity");
		b1.setQuantity(sc.nextInt());
		
		return b1;
		
	}
	
	public static void main(String[] args) {
		Collected c1=new Collected();
		
		Books coll=getBook();
		Scanner sc=new Scanner(System.in);
		c1.addbooks(coll);
	}

}
