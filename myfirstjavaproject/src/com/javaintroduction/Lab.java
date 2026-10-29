/*

Create 4 methods – 2 static and 2 instance methods. Write a statement inside each method to identify which method is called.

b) Call only one method inside main(), but the output should display statements from all 4 methods.
*/

package com.javaintroduction;

public class Lab {

	static void staticmethod1() {
		System.out.println("static method 1 called");
	}

	static void staticmethod2() {
		System.out.println("static method 2 called");
	}

	void Instancemethod1() {
		System.out.println("Instance method 1 called");
		staticmethod1();
		staticmethod2();
		Instancemethod2();
	}

	void Instancemethod2() {
		System.out.println("Instance method 2 called");
	}

	public static void main(String[] args) {
		
		
		Lab obj=new Lab();
				
		obj.Instancemethod1();
		
				
				
	}

}
