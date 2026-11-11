package com.logicalStatements.com;

import java.util.Scanner;

public class VotingSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Age:");

		int age = sc.nextInt();

		System.out.println("you are a IndianCitizen ?? (true/false)");

		boolean IndianCitizen = sc.nextBoolean();

		System.out.println("you have Voterid ?? (true/false)");

		boolean Voterid  =sc.nextBoolean();
		
		if(age <0) {
			System.out.println("Invalid Age");
		}
		else if(age<18) { 
			System.out.println("Not eligble to Vote");
		}
		else if( IndianCitizen == false) {
			System.out.println("Not eligble to Vote");
		}
		else if(Voterid == false) {
			System.out.println("Voter id required");
		}
		else {
			System.out.println("Eligible to vote");
		
		}
		sc.close();

	}

}
