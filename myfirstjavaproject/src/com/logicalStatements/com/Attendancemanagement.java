package com.logicalStatements.com;

import java.util.Scanner;

public class Attendancemanagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("are you are regular to class");
		boolean areyouregulartoclass=sc.nextBoolean();
		
		System.out.println("are you are regular to labsession");
		boolean areyouregulartolabsession=sc.nextBoolean();
		
		System.out.println("are you attending test every week");
		boolean areyouattendingtest=sc.nextBoolean();
		
		System.out.println("are you attending mocks every week");
		boolean areyouattendingmocks=sc.nextBoolean();
		
		
		if(areyouregulartoclass && areyouregulartolabsession && areyouattendingtest && areyouattendingmocks )
			System.out.println("you will get job within 6 months:");
			
		else
			System.out.println("sorry yu may go for shed:");
		
		sc.close();
		
	

	}

}
