package com.multithreadingtask3;

public class Thread1 extends Thread
{
	public void run() 
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("After name change "+Thread.currentThread().getName());
	}

}
