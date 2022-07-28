package com.multithreadingtask2;

import java.util.Scanner;

public class Display extends Thread {
	public void run() {
		System.out.println("Sum of two values is "+Add.c);
		System.out.println("Avg of two values is "+Avg.c);
	}
}
