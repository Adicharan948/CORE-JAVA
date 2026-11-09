package com.Arrays;

public class Print10ages {

	public static void main(String[] args) {
		
		//Decalration
		int[] ages;
		
		//creation
		ages=new int[10];
		
//initialize
		ages[0]=21;
		ages[1]=21;
		ages[2]=21;
		ages[3]=21;
		ages[4]=21;
		ages[5]=21;
		ages[6]=21;
		ages[7]=21;
		ages[8]=21;
		
		//representation
		
		for(int i=0;i< ages.length;i++) {
			System.out.println(ages[i]);
		}
		
//		for(int age:ages) {
//			System.out.println(age);
//		}

	}

}
