package com.languagefundamentals.Methods;

import java.util.Scanner;

public class StudentInfo {

	void main(String[] args) {

		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter address:");
		String add=sc.nextLine();
		studentaddres(add);

		System.out.println("main method ended");
		sc.close();

	}

	void studentname(String name) {
		System.out.println("studene name is:" + name);
	}

	void studentage(int age) {
		System.out.println("studene age is:" + age);
	}

	void studentmarks(int marks) {
		System.out.println("studene marks is:" + marks);
	}

	void studentphno(long phno) {
		System.out.println("studene phno is:" + phno);
	}
	
	void studentaddres(String address) {
		System.out.println("studene address is:" + address);
	}


}
