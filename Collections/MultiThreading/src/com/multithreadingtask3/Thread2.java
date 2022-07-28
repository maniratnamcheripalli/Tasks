package com.multithreadingtask3;

public class Thread2  extends Thread 
{
	public void run() 
	{
		System.out.println(Thread.currentThread().getName());
		try 
		{	
			Thread.sleep(1000);
			Thread.currentThread().interrupt();
			System.out.println(Thread.currentThread().isInterrupted());
			System.out.println("Waited for 1sec");
		} 
		catch (InterruptedException e) 
		{
			System.out.println("Handled");
		}
	}
}
