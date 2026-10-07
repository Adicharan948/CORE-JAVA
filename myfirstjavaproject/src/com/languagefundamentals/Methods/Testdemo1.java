package com.languagefundamentals.Methods;


//no return type+no parameters
public class Testdemo1 {
	
	public static void welcome() {
		System.out.println("welcome to java");
	}
	
	public void hello() {
		System.out.println("good morning guy'sxx	");
	}

	public static void main(String[] args) {
		
		Testdemo1 t=new Testdemo1();
		
		System.out.println("main method started");
		
		welcome();
		
		t.hello();
		
		
		
		System.out.println("main method ended");

	}

}
