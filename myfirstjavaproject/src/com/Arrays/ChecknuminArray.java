package com.Arrays;

import java.util.Scanner;

public class ChecknuminArray {

	public static void main(String[] args) {

		int[] arr = { 1, 23, 6, 4, 6, 78, 4, 7, 8, 3, 6, 8, 9, 47, 9, 78 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to search:");
		int key = sc.nextInt();
		boolean Status = false;
		for (int n : arr) {
			if (n == key) {
				Status=true;
				System.out.println("element found"+n);
				break;
			}
		}
		if(!Status) {
			System.out.println("not found");
		}

	}

}
