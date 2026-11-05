package com.logicalStatements.Loops;

import java.util.Scanner;

public class DectoBin {

//Decimal to Binary number
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		String bin="";
		int r=0;
		
		while(n>0) {
			r=n%2;
			n=n/2;
			bin=r+bin;
		}
		System.out.println(bin);

	}

}
