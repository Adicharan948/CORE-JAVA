package com.logicalStatements.Loops;

import java.util.Scanner;
//
//2. Write a java program for Reverse a number and check number is palindrome or not
//
public class revnum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int rev=0;
		
		
		System.out.println("Enter a number:");
		
		int n=sc.nextInt();
		int temp=n;
		
		while(n>0) {
			
			int d=n%10;
			
			rev=rev*10+d;
			n=n/10;
		}
		System.out.println(rev);
		
		if(temp==rev) {
			System.out.println("Given num is palindrome");
		}else {
			System.out.println("Given num is not palindrome");
		}
		sc.close();

	}

}
