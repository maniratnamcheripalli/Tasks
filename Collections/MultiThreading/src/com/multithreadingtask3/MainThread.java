package com.multithreadingtask3;

public class MainThread {
	public static void main(String[] args) throws InterruptedException 
	{
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		Thread3 t3=new Thread3();
		t1.start();
		t1.setName("Mani");
		//System.out.println(t1.getName());
		t1.join();
		System.out.println("Checking mani thread is alive "+ t1.isAlive());
		t2.start();
		t3.setDaemon(true);
		t3.start();
	}
}
