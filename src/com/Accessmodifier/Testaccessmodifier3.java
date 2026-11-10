package com.Accessmodifier;

public class Testaccessmodifier3 {

	public static void main(String[] args) {
		
		
		Testaccessmodifier1 t1 = new Testaccessmodifier1();
		
		//default with in the package
				System.out.println(t1.id1);
				System.out.println(t1.name1);
				t1.method2();
				
				
				//public with in the package
				System.out.println(t1.id3);
				System.out.println(t1.name3);
				t1.method3();
				
				
				//protected with in the package
				System.out.println(t1.id4);
				System.out.println(t1.name4);
				t1.method4();

	}

}
