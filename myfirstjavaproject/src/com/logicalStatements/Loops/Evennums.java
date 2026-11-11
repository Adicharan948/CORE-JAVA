package com.logicalStatements.Loops;


//2.Write a Java program to print all even numbers from 1 to 50 using a for loop.

import java.util.Scanner;

public class Evennums {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a num");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
