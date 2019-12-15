package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main (String args[]) {
		
		LocalDate dt = LocalDate.now();
		System.out.println("Localdate is  : "+ dt);
		
		LocalTime tm = LocalTime.now();
		System.out.println("LocalTime is  : "+ tm);
		
		LocalDateTime dttm = LocalDateTime.now();
		System.out.println("LocalDateTime is  : "+ dttm);
		
		
		DateTimeFormatter format= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM:SS");
		String formatDate = dttm.format(format);
		System.out.println("formatted LocalDateTime is  : "+ formatDate);
		
		
		
	}
	
}
