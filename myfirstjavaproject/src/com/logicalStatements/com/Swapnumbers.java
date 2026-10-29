package com.logicalStatements.com;

import java.util.Scanner;

public class Swapnumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number a:");

		int a = sc.nextInt();

		System.out.println("Enter number b:");

		int b = sc.nextInt();
		
		System.out.println("before swapping:"+ a+" "+b+" ");
		
		int C=a;
		a=b;
		b=C;
		
		System.out.println("after swapping:"+ a+" "+b+" ");
		
		sc.close();

	}

}
