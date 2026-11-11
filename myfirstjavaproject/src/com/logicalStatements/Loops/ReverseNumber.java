package com.logicalStatements.Loops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		int rem=0;
		int rev=0;
		int temp =n;
		
		while(n>0) {
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		
		if(rev==temp) {
			System.out.println("Given number is palindrome:");
			
		}else {
			System.out.println("Given number is not palindrome:");
		}
		
		System.out.println("revense number is:"+rev);

	}

}
