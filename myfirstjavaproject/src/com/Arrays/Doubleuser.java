package com.Arrays;

import java.util.Scanner;

public class Doubleuser {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entert the size of Array:");
		int size=sc.nextInt();
		
		double[] arr=new double[size];
		
		System.out.println("Enter the numbers:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextDouble();
		}
		
		for(double n:arr) {
			System.out.println(n);
			
		}
		sc.close();

	}

}
