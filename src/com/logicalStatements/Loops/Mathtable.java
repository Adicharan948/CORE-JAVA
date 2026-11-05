package com.logicalStatements.Loops;

import java.util.Scanner;

public class Mathtable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("which table yu want:");
		int n=sc.nextInt();
		System.out.println("how many values yu want:");
		int n1=sc.nextInt();
		
		
		for(int i=1;i<=n1;i++)
			System.out.println(n + " x"+i+" ="+ (n*i));

	}

}
