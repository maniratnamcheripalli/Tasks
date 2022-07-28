package com.oops;

public class Box3d extends Box {
	int length,breadth,height;
	Box3d(int l1, int b1, int h1) {
		super(l1, b1, h1);
		length=l1;
		breadth=b1;
		height=h1;
		
	}
	void display() {
		System.out.println("area of cuboid");
		System.out.println(2*length*breadth+2*length*height+2*height*breadth);
		System.out.println("volume of cuboid");
		System.out.println(length*height*breadth);
	}
}
