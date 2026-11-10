package com.Arrays;

import java.util.Scanner;

public class Stringuser {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		
		sc.nextLine();
		String[]arr=new String[size];
		
		System.out.println("ENter the String :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextLine();
		}
		
		for(String n:arr) {
			System.out.println(n+" ");
		}
		sc.close();
		

	}

}
