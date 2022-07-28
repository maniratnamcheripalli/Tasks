package com.multithreadingtask1;

public class MainClass {

	public static void main(String[] args) {
		
		SubClass sc=new SubClass();
		Sub s=new Sub();
		sc.start();
		s.start();
		System.out.println("java is invigorating");

	}

}
