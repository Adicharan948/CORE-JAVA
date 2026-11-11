//1.Write a Java program to calculate the electricity bill based on the connection type and the number of units consumed.
//
//Requirements:
// > Ask the user to enter   connection type
//a) → Domestic
//b) → Commercial
//› Using switch case to determine the selected connection type.
//› Ask the user to enter the number of units consumed.
//
//a) Domestic Connection:
//› If units are 100 or less, charge 2 per unit.
//If units are greater than 300 charge 3 change a per unit 
//
//b) Commercial Connection:
//› If units are 100 or less, charge 4 per unit.
//› If units are greater than 100 and up to 300, charge 6 per unit.
//› If units are greater than 300, charge 8 per unit. Atlast, display the following details:
//Connection Type
//Units Consumed
//Rate Per Unit
//Total Electricity Bill

package com.logicalStatements.com;

import java.util.Scanner;

public class Electricitybill {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("calculating the electricity bill:");
		System.out.println("Enter connectipon type:");
		String connection=sc.next();
		switch(connection) {
		
		case "domestic" ->{
			double bill=0;
			System.out.println("Enter number of units Consumed:");
			int n=sc.nextInt();
			if(n<=100) {
				bill=n*2;
				System.out.println("Rate per unit is :2rs/");
				System.out.println("Total electricty bill :"+bill);
			}else if(n>=101 && n<=300) {
				bill=n*3;
				System.out.println("Rate per unit is :3rs/");
				System.out.println("Total electricty bill :"+bill);
			}else {
				bill=n*3.5;
				System.out.println("Rate per unit is :3.5rs/");
				System.out.println("Total electricty bill :"+bill);
			}
		}
		case "commerical" ->{
			double bill=0;
			System.out.println("Enter number of units Consumed:");
			int n=sc.nextInt();
			if(n<=100) {
				bill=n*4;
				System.out.println("Rate per unit is :4rs/");
				System.out.println("Total electricty bill :"+bill);
			}else if(n>=101 && n<=300) {
				bill=n*6;
				System.out.println("Rate per unit is :6rs/");
				System.out.println("Total electricty bill :"+bill);
			}else {
				bill=n*8;
				System.out.println("Rate per unit is :8rs/");
				System.out.println("Total electricty bill :"+bill);
			}
		}
		
		default -> System.out.println("invalid connection type:");
		 
		}
		sc.close();

	}

}
