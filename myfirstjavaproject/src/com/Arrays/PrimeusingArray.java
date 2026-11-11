package com.Arrays;

import java.util.Scanner;

public class PrimeusingArray {
	
	static boolean  isprime(int n) {
		boolean Status=true;
		
		if(n==0 || n==1) {
			return false;
		}
		
		for(int i =2;i< n;i++) {
			if(n%i==0) {
				Status=false;
				break;
			}
		}
		return Status;
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entet the size of array:");
		int size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("enter the elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int n:arr) {
			if(isprime(n)) {
			System.out.println(n);
			}
		}
		

	}

}
