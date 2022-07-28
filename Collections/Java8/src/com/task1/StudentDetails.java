package com.task1;

public class StudentDetails {
	private int id;
	String name;
	private float marks;


	public StudentDetails(int id2, String name2, float marks2) {
		id=id2;
		name=name2;
		marks=marks2;
	}
	
	public String toString(){
		return id+" "+name+" "+marks;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

}
