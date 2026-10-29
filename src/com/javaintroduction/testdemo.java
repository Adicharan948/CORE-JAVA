/*

Java

Write a Java program that defines 5 methods (3 static and 2 instance methods) and demonstrate what happens when these methods are not invoked from the main() method.but invoked  all 5 methods
*/


package com.javaintroduction;

public class testdemo {
	
	static void staticmethod1() {
		System.out.println("static method 1 called");
	}
	
	static void staticmethod2() {
		System.out.println("static method 2 called");
	}
	
	static void staticmethod3() {
		System.out.println("static method 2 called");
	}
	
	void Instancemethod1() {
		System.out.println("Instance method 1 called");
		staticmethod3();
		staticmethod2();
		staticmethod1();
		Instancemethod2();
	}
	
	void Instancemethod2() {
		System.out.println("Instance method 2 called");
	}

	public static void main(String[] args) {
		
		
		testdemo obj=new testdemo();
		
		obj.Instancemethod1();
				

		
		}

}
