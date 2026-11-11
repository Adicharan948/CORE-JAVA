package com.logicalStatements.com;

import java.util.Scanner;

public class Daysusingswitch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		
		switch(a) {
		
		case 1 -> System.out.println("Sunday");
		case 2 -> System.out.println("monday");
		case 3 -> System.out.println("Tuesday");
		case 4 -> System.out.println("Wednesday");
		case 5 -> System.out.println("Thursday");
		case 6 -> System.out.println("Friday");
		case 7 -> System.out.println("saturday");
		
		default -> System.out.println("Inalivid number:");
		}
		
		sc.close();

	}

}
