package com.logicalStatements.Loops;

import java.util.Scanner;
//prime numbers
public class Primenum {
	
	static boolean isprime(int n) {
		boolean Status=true;
		
		if(n==0 || n==1) {
			return false;
			
		}
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return Status;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a nuber:");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(isprime(i)) {
				System.out.println(i+" ");
				
			}
		}

	}

}
