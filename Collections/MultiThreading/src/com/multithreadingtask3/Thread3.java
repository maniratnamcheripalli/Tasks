package com.multithreadingtask3;

public class Thread3  extends Thread
{
	public void run()  
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("Is this daemon thread "+Thread.currentThread().isDaemon());
		
		
	}
}
