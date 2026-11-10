package com.Arrays;

import java.util.Scanner;

public class UserArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		
		int[]arr=new int[size];
		
		System.out.println("ENter the elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int n:arr) {
			System.out.println(n+" ");
		}
		sc.close();

	}

}
