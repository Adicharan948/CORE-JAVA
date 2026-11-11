package com.logicalStatements.Loops;

public class TestLP2 {
	
//	print 10 to 1

	public static void main(String[] args) {
		
		for(int i=10;i>=0;i--) {
			System.out.print(i+ " ");
		}
		
		for(long i=10;i>=0;i--) {
			System.out.print(i);
		}
		
		for(byte i=10;i>=0;i--) {
			System.out.print(i);
		}
		for(short i=10;i>=0;i--) {
			System.out.print(i);
		}
		
		for(double i=10;i>=0;i--) {
			System.out.print(i);
		}
		
		for(float i=10;i>=0;i--) {
			System.out.print(i);
		}
		for(Integer i=10;i>=0;i--) {
			System.out.print(i+" ");
		}
		
		for(int i=10;i>=0;i--) {
			if(i%2==0 && i!=0)
			System.out.print(i+" ");
		}

	}

}
