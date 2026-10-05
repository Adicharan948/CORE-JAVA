package com.languagefundamentals;

import java.util.Scanner;

public class Operations {

	static int add(int a, int b) {
		return a + b;
	}

	static int sub(int a, int b) {
		return a - b;
	}

	static int mul(int a, int b) {
		return a * b;
	}

	static int div(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a:");

		int a = sc.nextInt();

		System.out.println("enter b:");

		int b = sc.nextInt();
		
		System.out.println("ADD:"+add(a,b));
		System.out.println("SUB:"+sub(a,b));
		System.out.println("MUL:"+mul(a,b));
		System.out.println("DIV:"+div(a,b));

	}

}
