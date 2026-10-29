package com.languagefundamentals.Methods;

public class Arraymaxand2max {

	public static void main(String[] args) {
		
		int[] arr= {10,3,5,7654,78};
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		 System.out.println("Max: " + max);
	     System.out.println("Min: " + min);

	}

}
