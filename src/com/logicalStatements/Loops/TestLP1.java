package com.logicalStatements.Loops;

import java.util.Scanner;

//PRINT 1 to 10

public class TestLP1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float n = 56.0f;

		for(int i=0;i<=n;i++) {
			System.out.println(i);
		}

		for(byte i=0;i<=n;i++) {
			System.out.println(i);
		}

		for(short i=0;i<=n;i++) {
			System.out.println(i);
		}

		for(long i=0;i<=n;i++) {
			System.out.println(i);
	}

		for(double i=0;i<=n;i++) {
			System.out.println(i);
	}

		for (float i = 0; i <= n; i++) {
			System.out.println(i);
		}

		sc.close();

	}

}
