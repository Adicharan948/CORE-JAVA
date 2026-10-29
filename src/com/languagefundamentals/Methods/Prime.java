package com.languagefundamentals.Methods;


public class Prime {

	public static void main(String[] args) {
		
		int n=4;
		int count=0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.print("prime");
		}else {
			System.out.print("not prime");
		}

	}

}
