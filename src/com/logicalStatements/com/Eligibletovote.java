package com.logicalStatements.com;

import java.util.Scanner;


public class Eligibletovote {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number");
		int a =sc.nextInt();
		
		if(a>=18)
			System.out.println("congrats your are eligible to vote");
		
		else
			System.out.println("sorry bhai");
		
		sc.close();

	}

}
