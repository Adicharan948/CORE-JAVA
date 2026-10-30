package com.logicalStatements.com;

import java.util.Scanner;

public class DaysSwitchExp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a day:");
		String Day=sc.next();
		
		switch(Day) {
		
		case "monday" -> System.out.println("monday is lazy day");
		case "tuesday" -> System.out.println("working day");
		case "wednesday"-> System.out.println("chicken day in hostel");
		case "thursday" -> System.out.println("working day asual");
		case "friday" -> System.out.println("movies relase day weekeend");
		case "saturday"-> System.out.println("weekend chill out");
		case "sunday" -> System.out.println("rest mode fay");
		
		default -> System.out.println("Inalivid day:");
		}
		
		sc.close();

	}

}
