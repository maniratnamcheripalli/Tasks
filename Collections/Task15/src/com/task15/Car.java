package com.task15;

public class Car {
	static int slot=30;
	int vno;
	long mn;
	String name;
	 Car(int vno, long mn,String name) {
		super();
		this.vno = vno;
		this.mn = mn;
		this.name=name;
	}

	public static int getSlot() {
		slot--;
		return slot;
	}
	public static void setSlot(int slot) {
		Car.slot = slot;
	}
	public int getVno() {
		return vno;
	}
	public void setVno(int vno) {
		this.vno = vno;
	}
	public long getMn() {
		return mn;
	}
	public void setMn(long mn) {
		this.mn = mn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
