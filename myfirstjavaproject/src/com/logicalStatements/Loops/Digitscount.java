package com.logicalStatements.Loops;

import java.util.Scanner;

public class Digitscount {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int digitcount=0;
		
		while(n>0) {
			n=n/10;
			digitcount++;
		}
		System.out.println("Given number count is:"+digitcount);

	}

}
