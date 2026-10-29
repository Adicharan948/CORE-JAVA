package com.logicalStatements.com;

import java.util.Scanner;

public class GradesofStudents {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter marks");

		int m = sc.nextInt();
		if (m >= 90 && m <= 100) {
			System.out.println("Grade is A");
		} else if (m >= 80 && m <= 89) {
			System.out.println("Grade is B");
		} else if (m >= 70 && m <= 79) {
			System.out.println("Grade is C");
		} else if (m >= 60 && m <= 69) {
			System.out.println("Grade is D");
		} else if (m >= 0 && m <= 59) {
			System.out.println("fail");
		} else {
			System.out.println("Invalid marks");
		}

		sc.close();

	}

}
