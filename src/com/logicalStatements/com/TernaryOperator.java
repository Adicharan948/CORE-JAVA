//1.check whether a number is positive or negative using Tenary Operator 

package com.logicalStatements.com;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a nun:");
		
		int a =sc.nextInt();
		
		String a1=(a>0)?"pos":"neg";
		
		System.out.println(a1);
		
		sc.close();
		

	}

}
