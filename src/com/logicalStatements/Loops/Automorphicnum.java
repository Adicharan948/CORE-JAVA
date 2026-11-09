package com.logicalStatements.Loops;

import java.util.Scanner;

public class Automorphicnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		int square=n*n;
		int temp=n;
		int count=0;
		
		while(temp>0) {
			count++;
			temp=temp/10;
		
		
		}
		int ld=square %(int)Math.pow(10,count);
		if(ld==n) {
			System.out.println("Auto");
		}else {
			System.out.println("not auto");
		}

	}

}
