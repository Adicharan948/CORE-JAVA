package com.logicalStatements.Loops;

import java.util.Scanner;

public class Magicnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int n=sc.nextInt();
		
		int num=n;
		
		while(num>9) {
			int sum=0;
			while(num>0) {
				sum=sum+(num%10);
				num=num/10;
				
			}
			num=sum;
		}
		
		if(num==1) {
			System.out.println("magic");
			
		}else {
			System.out.println("not magic");
		}

	}

}
