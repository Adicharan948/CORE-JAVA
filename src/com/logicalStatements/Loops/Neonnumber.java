package com.logicalStatements.Loops;

import java.util.Scanner;

//) Write java program to check given number is NEON number  or not using While loop
//Example: 9
//* 9 × 9 = 81
//* 8 + 1 = 9

public class Neonnumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int n=sc.nextInt();
		
		int sq=n*n;
		int sum=0;
		int temp=sq;
		
		while(temp>0) {
			int r=temp%10;
			temp=temp/10;
			sum=sum+r;
		}
		
		if(sum==n) {
			System.out.println("neon number:");
		}else {
			System.out.println(" not neon number:");
		}

	}

}
