package com.Accessmodifier;

public class Testaccessmodifier2 {

	public static void main(String[] args) {
		
		System.out.println("main method Started");
		
		Testaccessmodifier1 t1=new Testaccessmodifier1();
		System.out.println(t1.id1);
		System.out.println(t1.name1);
		t1.method2();
		System.out.println("main methos enede");

	}

}
