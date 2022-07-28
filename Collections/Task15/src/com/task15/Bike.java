package com.task15;

import java.util.ArrayList;

public class Bike {
	int vno;
	long mn;
	String name;
	Bike(int vno, long mn,String name) {
		super();
		this.vno = vno;
		this.mn = mn;
		this.name=name;
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
