package com.languagefundamentals.Methods;


//no return type+no parameters
public class Methods {
	
	public static void welcome() {
		System.out.println("welcome to java");
	}
	
	public void hello() {
		System.out.println("good morning guy'sxx	");
	}

	public static void main(String[] args) {
		
		Methods t=new Methods();
		
		System.out.println("main method started");
		
		welcome();
		
		t.hello();
		
		
		
		System.out.println("main method ended");

	}

}
