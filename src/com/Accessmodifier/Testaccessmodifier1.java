package com.Accessmodifier;

public class Testaccessmodifier1 {

	{
		System.out.println("instance block");
	}

	static{
		System.out.println("Static block");
	}
	
	public Testaccessmodifier1(){
		System.out.println("no arg constructor");
	}

	private int id=18;
	private String name="vk";

	private void method1() {
		System.out.println("method1 called");
	}
	
	public int id3=7;
	public String name3="mSD";

	public void method3() {
		System.out.println("method3 called");
	}

	
	protected int id4=23;
	protected String name4="sauju";

	protected void method4() {
		System.out.println("method4 called");
	}


	int id1=45;
	String name1="rs";

	void method2() {
		System.out.println("method2 called");
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Testaccessmodifier1 t1 = new Testaccessmodifier1();
		//private with in the calss
		System.out.println(t1.id);
		System.out.println(t1.name);
		t1.method1();
		
		//default with in the calss
		System.out.println(t1.id1);
		System.out.println(t1.name1);
		t1.method2();
		
		
		//public with in the calss
		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method3();
		
		
		//protected with in the calss
		System.out.println(t1.id4);
		System.out.println(t1.name4);
		t1.method4();

		System.out.println("main method Ended");

	}

}
