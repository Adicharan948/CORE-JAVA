package com.languagefundamentals.Methods;

public class Testdemo2 {

	public static void add(int a, int b) {
		System.out.println("addition is:" + (a + b));
	}

	public static void sub(int a, int b) {
		System.out.println("subtraction is" + (a - b));
	}

	public static void mul(int a, int b) {
		System.out.println("multiplication is:" + (a * b));
	}

	public static void div(int a, int b) {
		System.out.println("division is:" + (a / b));
	}

	public static void mod(int a, int b) {
		System.out.println("modolus is:" + (a % b));
	}


	public static void sum(int a, int b, int c) {
		System.out.println("total is:" + (a + b * c));
	}

//	
	public static void highest(int a, int b) {
		System.out.println("greater number is:" + (a > b));
	}

	public static void cube(int a) {
		System.out.println("cube is:" + (a * a * a));
	}


	public static void notequals(int a, int b) {
		System.out.println("not is:" + (a != b));
	}
	

	public static void String(String name,int age,int marks) {
		System.out.println("name is:"+name);
		System.out.println("age is:"+age);
		System.out.println("marks is:"+marks);
	}

	public static void posorneg(int n) {
		if (n > 0) {
			System.out.println("postive");
		} else {
			System.out.println("negative");
		}
	}

	public static void findLargestThree(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("largest number is: " + a);
		} else if (b > a && b > c) {
			System.out.println("largest number is: " + b);
		} else {
			System.out.println("largest number is: " + c);
		}
	}

	public static void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}

	public static void main(String[] args) {

		System.out.println("main method");

		add(100, 200);
		sub(1000, 200);
		mul(100, 200);
		div(10, 200);
		mod(10, 200);
		sum(100, 20, 40);
		highest(30, 100);
		cube(3);
		notequals(30, 30);
		

		String("sairam", 21, 98);

		posorneg(20);
		findLargestThree(10, 20, 30);
		printTable(5);

	}

}
