package com.Arrays;

public class Stringnames {

	public static void main(String[] args) {
		
		String[]names=new String[5];
		
		names[0]="sai";
		names[1]="ram";
		names[2]="baba";
		
		
//		for(int i=0;i<names.length;i++) {
//			System.out.println(names[i]);
//		}
		
		for(String name:names) {
			System.out.println(name);
		}
		

	}

}
