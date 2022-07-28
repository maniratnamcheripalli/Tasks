package com.practise;

public class AllenSolly extends NeighbourShop {
	@Override
	void jeans() {
		System.out.println("Allen Solly Shop");
	}

	public static void main(String[] args) {
		NeighbourShop ob=new NeighbourShop();
		ob.jeans();
	}

}
