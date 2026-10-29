package com.languagefundamentals.Methods;

public class Revnum {

	public static void main(String[] args) {
		int n=1245;
		int rev=0;
		
		while(n>0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		
		System.out.println(rev);
	}

}
