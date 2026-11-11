package com.logicalStatements.Loops;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int n1=n;
		int temp=n;
		int rem=0;
		int sum=0;
		int digitcount=0;
		
		while(n>0) {
			n=n/10;
			digitcount++;
		}
		
		while(n1>0) {
			rem=n1%10;
			n1=n1/10;
			sum=(int) (sum+Math.pow(rem, digitcount));
			
		}
		if(sum==temp) {
			System.out.println("Given number is Amstrong");
		}else {
			System.out.println("Given number is not Amstrong");
		}
		sc.close();

	}

}
