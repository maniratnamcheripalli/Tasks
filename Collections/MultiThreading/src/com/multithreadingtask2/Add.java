package com.multithreadingtask2;

public class Add extends Thread {
	static int a, b, c;

	public Add(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void run() {
		c = a + b;
	}

}
