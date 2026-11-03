package com.logicalStatements.Loops;

import java.util.Scanner;

//wap to print factors of number

public class TestLP3 {

	  static void findfactors(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		findfactors(n);
		sc.close();
			

	}


}
