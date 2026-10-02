//Create a Java program to store Student ID, Marks, and Pass Status using wrapper classes.
//* Use Autoboxing to convert primitive data type to wrapper data type  
//* Use Unboxing to convert wrapper data type to primitive data type 
//* Display the student details.

package com.languagefundamentals;

public class DataTypesdemo {
	//primitive data types
	int i=100;
	double marks=78.9;
	boolean b=true;
	
//	wrapper data types
	Integer i1=i;
	Double marks1=marks;
	boolean b1=b;
	
//	then wrapper to primitive data types
	
	int i2=i1;
	double d=marks1;
	boolean b2=b1;
	
	
	

	public static void main(String[] args) {
		
		DataTypesdemo t=new DataTypesdemo();
//	primitive data type to wrapper data type autoboxing.
		System.out.println("Autoboxing");
		System.out.println(t.i1);
		System.out.println(t.marks1);
		System.out.println(t.b1);
		
//wrapper data type to primitive data type autounboxing.
		System.out.println("AutoUnboxing");
		System.out.println(t.i2);
		System.out.println(t.d);
		System.out.println(t.b2);
		

	}

}
