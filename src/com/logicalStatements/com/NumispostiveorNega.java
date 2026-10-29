package com.logicalStatements.com;

import java.util.Scanner;

public class NumispostiveorNega {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int a=sc.nextInt();
		
		if(a>=0)
			System.out.println("number is postive");
		
		else
			System.out.println("number is negative");
		
		sc.close();
		
		

	}

}
