package com.Arrays;

public class Salarydouble {

	public static void main(String[] args) {
		
//		double[] sal=new double[3];
		
//		sal[0]=1000;
//		sal[1]=2345.98;
//		sal[2]=3456.32;
		
		double[]sal= {1000,2345.67,4554.46};
		
		for(int i=0;i<sal.length;i++) {
			System.out.println(sal[i]);
		}
		
		for(double salary:sal) {
			System.out.println(salary);
		}

	}

}
