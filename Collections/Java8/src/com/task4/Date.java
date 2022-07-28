package com.task4;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

//1.LocalDate 2.LocalTime 3.LocalDateTime APIs.
public class Date {

	public static void main(String[] args) {
		LocalDate date= LocalDate.now();
		LocalTime time=LocalTime.now();
		LocalDateTime dateTime=  LocalDateTime.now();
		System.out.println("Current time "+time);
		System.out.println("Current date "+date);
		System.out.println("Date Time "+dateTime);
	}

}
