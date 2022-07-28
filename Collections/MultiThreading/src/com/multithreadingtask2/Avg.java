package com.multithreadingtask2;

public class Avg extends Thread {
	static int a,b,c;
	public Avg(int a, int b) {
		this.a=a;
		this.b=b;
	}

	public void run() {
		c=(a+b)/2;

	}

}
