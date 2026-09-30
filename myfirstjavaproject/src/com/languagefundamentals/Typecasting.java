//.Create a Java program to:
//* Convert int → double.
//* Convert double → int.
//* Convert char → int.
//* Convert int → char.
//Display all converted values.


//Types of Type Casting
//widening -Implicit type casting   smaller to larger data type --->byte -- short -- char--int ---long -- float -- double
//narrowing - explicit type casting    larger to smaller data type  ---> double -- float -- long -- int -- char -- short -- byte


package com.languagefundamentals;

public class Typecasting {
	
	public static void main(String[] args) {
		
		
		char c=97; //implicit type casting  char to int 
		
		
//implicit type casting int to double
		int i1=56783;
		double i2=(double)i1;
		
//explicit type casting double to int 
		double d=7988.8873D;
		int d2=(int)d;
		
//explicit type casting int to char
		
		int i4=121;
		char a=(char)i4;
		
// explicit type casting int to byte
		
		byte x=(byte)129;
		
// explicit type casting int to short
		 short m=(short)32784;
		 
// explicit type casting long to int
		 
		 int w=(int)659873987L;
		
//implicit type casting int to long
		 
		 int i5=58968978;
		 long l=(long) (i5);
		
		
		System.out.println(c);
		System.out.println(i2);
		System.out.println(d2);
		System.out.println(a);
		System.out.println(x);
		System.out.println(m);
		System.out.println(w);
		System.out.println(l);
		
		
		
		
		

	}

}
