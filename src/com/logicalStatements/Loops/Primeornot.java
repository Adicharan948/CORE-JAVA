package com.logicalStatements.Loops;

import java.util.Scanner;

public class Primeornot {
	
	
	static boolean isprime(int n) {
		
	boolean status=true;
	
	if(n==0 || n==1) {
		return false;
	}
	for(int i=2;i<=n;i++){
		if(n%i==0) {
			return false;
		}
	}
	
	return status;
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("check number is prime or not enter number:");
		int n=sc.nextInt();
		
		boolean flag=isprime(n);
		
		if(flag) {
			System.out.println("Given num is prime");
		}else {
			System.out.println("Given num is not prime num");
		}
		sc.close();

	}

}
