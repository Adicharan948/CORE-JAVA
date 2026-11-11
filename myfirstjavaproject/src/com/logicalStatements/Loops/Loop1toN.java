package com.logicalStatements.Loops;

import java.util.Scanner;

//Java
//1.Write a Java program to print numbers from 1 to 20 using a for loop.

public class Loop1toN {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entr a num:");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		
		for(int i=n;i>=1;i--) {
			System.out.println(i);
		}
		sc.close();

	}

}
