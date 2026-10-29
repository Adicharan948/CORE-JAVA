package com.languagefundamentals.Methods;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		String rev = " ";

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String:");
		String s = sc.nextLine();

		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);

		}

		System.out.println(rev);

	}

}
