package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] names = new String[5];

		System.out.println("Enter the elements:");

		for (int i = 0; i < names.length; i++) {
			names[i] = sc.nextLine();
		}
		System.out.println(Arrays.toString(names));
		for (int i = 0; i < names.length; i++) {
			if (names[i].toLowerCase().startsWith("r") && names[i].endsWith("t")) {
				System.out.println((names[i]));
			}
		}

	}

}
