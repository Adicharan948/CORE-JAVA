package com.Arrays;

import java.util.Scanner;

public class ChecjnuminArrayandindex {

	public static void main(String[] args) {
		int []arr= {1,2,3,5,6,7,5,3,6,8,6,4};
		
		Scanner sc=new Scanner(System.in);
		boolean Status=false;
		
		System.out.println("Enter the element to search:");
		int key=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				Status=true;
				System.out.println("element found"+i);
				break;
			}
		}
		if(!Status) {
			System.out.println("not found");
		}
		
		

	}

}
