package com.Arrays;

public class MinandMax {

	public static void main(String[] args) {
		
		int[] num= {10,1,20,3,56,34,67,8,2};
		
		int max=num[0];
		int min=num[0];
		
		
		for(int n:num) {
			if(n<min) {
				min=n;
			}else if(n>max){
				max=n;
			}
		}
		System.out.println(min);
		System.out.println(max);
		
		

	}

}
