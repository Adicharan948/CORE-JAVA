package com.Accessmodifier;

public class Testaccessmodifier1 {

	{
		System.out.println("instance block");
	}

	static{
		System.out.println("Static block");
	}
	
	Testaccessmodifier1(){
		System.out.println("no arg constructor");
	}

	private int id=18;
	private String name="vk";

	private void method1() {
		System.out.println("method1 called");
	}


	int id1=45;
	String name1="rs";

	void method2() {
		System.out.println("method2 called");
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Testaccessmodifier1 t1 = new Testaccessmodifier1();
		System.out.println(t1.id);
		System.out.println(t1.name);
		t1.method1();
		
		System.out.println(t1.id1);
		System.out.println(t1.name1);
		t1.method2();

		System.out.println("main method Ended");

	}

}
