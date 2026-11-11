package com.logicalStatements.Loops;

import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class RandomGuessnumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=new Random().nextInt(100)+1;
		
		
		for(int i=1;i<=3;i++) {
			System.out.println("chance" + i + " - Guess(1-100)");
			int g=sc.nextInt();
			
			
			if(g==num) {
				System.out.println("congraulations! you guessed correct");
				break;
			}else if(g < num) {
				System.out.println("too low");
			}else {
				System.out.println("too high");
			}
			
		}
		System.out.println("Game over ! try again"+ "="+  num);

	}

}
