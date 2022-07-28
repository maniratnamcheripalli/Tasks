package com.task3;

interface Method{
	float run(float a);
}
@FunctionalInterface
interface Mani extends Method{
	default public void fun() {
		System.out.println("Default Method");
	}
}
public class FunctionalInterfaceTask {

	public static void main(String[] args) {
		
		Mani l= (p)->{
			return p;
		};
		System.out.println(l.run(5.6f));
		
		l.fun();
		Method l1= (p)->{
			return p;
		};
		System.out.println(l1.run(8.6f));
		


	}

}
