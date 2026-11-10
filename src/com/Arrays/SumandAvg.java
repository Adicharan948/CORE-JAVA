package com.Arrays;

public class SumandAvg {

	public static void main(String[] args) {
		
		int []marks= {1,2,3,4,5};
		
		double sum=0;
		double avg=0;
		
		for(int n:marks) {
			sum=sum+n;
		}
		
//		for(int i=0;i<marks.length;i++) {
//			sum=sum+marks[i];
//		}
		
		avg=sum/marks.length;
		
		System.out.println(sum);
		System.out.println(avg);

	}

}
