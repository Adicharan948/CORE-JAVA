package com.logicalStatements.Loops;

import java.util.Scanner;

public class BintoDEc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary number:");
        int n = sc.nextInt();

        int dec = 0;
        int p = 1; // 2^0 = 1

        while (n > 0) {
            int r = n % 10;
            dec = dec + r * p;
            p = p * 2;
            n = n / 10;
        }
        System.out.println(dec);
    }
}