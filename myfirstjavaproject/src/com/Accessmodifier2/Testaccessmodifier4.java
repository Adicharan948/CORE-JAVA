package com.Accessmodifier2;

import com.Accessmodifier.Testaccessmodifier1;

public class Testaccessmodifier4 extends Testaccessmodifier1 {

	public static void main(String[] args) {

		Testaccessmodifier4 t = new Testaccessmodifier4();

		// default other package cannot access
//				System.out.println(t1.id1);
//				System.out.println(t1.name1);
//				t1.method2();

		// public other package
		System.out.println(t.id3);
		System.out.println(t.name3);
		t.method3();

//		//protected with other package using sub class by sub class extends
		System.out.println(t.id4);
		System.out.println(t.name4);
		t.method4();

	}

}
