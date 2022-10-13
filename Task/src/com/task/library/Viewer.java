package com.task.library;

import java.util.ArrayList;

public class Viewer {
	int i=1;
	public void viewer(ArrayList<Library> list) {
		for(Library li:list) {
			System.out.println("Book "+i+" "+li);
			i++;
		}
			
	}
}
