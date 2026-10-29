package com.logicalStatements.com;

import java.util.Scanner;

public class Ageproblem {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		if(age>=0 && age<=5) {
			System.out.println("you are a kod");
		}else if(age>=6 && age<=12) {
			System.out.println("Yor are a childern");
		}else if(age>=13 && age<=19) {
			System.out.println("Yor are a Teentage");
		}else if(age>=20 && age<=35) {
			System.out.println("Yor are a Youth");
		}else if(age>=36 && age<=60) {
			System.out.println("Yor are a middle age");
		}else if(age>60) {
			System.out.println("Yor are a Senior Citizen");
		}else {
			System.out.println("invalid age");
		}
		
		sc.close();



	}

}
