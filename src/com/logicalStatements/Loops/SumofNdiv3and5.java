package com.logicalStatements.Loops;

import java.util.Scanner;

//.Write a Java program to find the sum of all numbers from 1 to N that are divisible by both 3 and 5 using a for loop.

public class SumofNdiv3and5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a num");
		
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			if(i% 3==0 && i% 5==0) {
				sum=sum+i;
			}
			
		}
		
		System.out.println(sum);
		sc.close();

	}

}
