package com.logicalStatements.com;

import java.util.Scanner;

//wap for check name is lessthan 15 character for passport name

public class Checkname {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a fullname");
		
		String name=sc.nextLine();
		
		if(name.length()<=15)
			System.out.println("given name is valid your are eligible for passport");
		else
			System.out.println("given name is  not valud your are not eligible for passport");
		sc.close();

	}

}
