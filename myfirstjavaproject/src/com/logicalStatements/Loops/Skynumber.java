package com.logicalStatements.Loops;

import java.util.Scanner;

//2) Write java program to check given number is SKY number  or not using While loop
//Example: 1124
//- Sum = 1 + 1 + 2 + 4 = 8
//- Product = 1 × 1 × 2 × 4 = 8

public class Skynumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		int sum=0;
		int product=1;
		int temp=n;
		
		
		while(temp>0) {
			int r=temp%10;
			temp=temp/10;
			sum=sum+r;
			product=product*r;
			
		}
		if(sum==product) {
			System.out.println("Sky number"+n);
		}else {
			System.out.println("not sky number"+n);
		}

	}

}
