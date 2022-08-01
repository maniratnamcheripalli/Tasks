package com.practise;

public class AllenSolly extends NeighbourShop {
	@Override
	void show() {
		System.out.println("New varient not found");
	}

	public static void main(String[] args) {
		NeighbourShop ob=new AllenSolly();
		ob.show();
	}

}
