package com.task.library;

public class Library {
	
	private String name;
	private String author;

	public Library(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", author=" + author+"]";
	}
	

	

}
