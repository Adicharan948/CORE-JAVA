package com.Arrays;

import java.util.Scanner;

public class Occuenceofelement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[]n= {1,2,3,45,6,7,8,4,1,2,3};
		int count=0;
		System.out.println("Enter a elementr");
		int element=sc.nextInt();
		for(int i=0;i<n.length;i++) {
			if(n[i]==element) {
				count++;
			}
			
		}
		System.out.println(count);

	}

}
