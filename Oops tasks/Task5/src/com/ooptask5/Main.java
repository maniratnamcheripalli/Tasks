package com.oops;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sa=new Scanner(System.in);
		System.out.println("enter length,breadth,height of cuboid");
		int l=sa.nextInt();
		int b=sa.nextInt();
		int h=sa.nextInt();
		Box3d d=new Box3d(l,b,h);
		d.display();
		Box ba=new Box(l,b,h);
		ba.display();
	}

}
