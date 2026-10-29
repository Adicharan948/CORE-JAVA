//1. Create a Java program to store the following student details using Wrapper Classes only:
//* Student ID → Integer
//* Student Name → String
//* Age → Integer
//* Marks → Double
//* Grade → Character
//* Passed → Boolean


package com.languagefundamentals;

public class Wrapperdatatypes {
	
	Integer studentid=192224012;
	String studentname="charan";
	Integer Age=21;
	Double marks=98.7;
	Character grade='s';
	Boolean passed=true;
	
	public static void main(String[] args) {
		Wrapperdatatypes d=new Wrapperdatatypes();
		
		System.out.println("studentid is:"+d.studentid);
		System.out.println("studentname is:"+d.studentname);
		System.out.println("age is:"+d.Age);
		System.out.println("my marks is:"+d.marks);
		System.out.println("grade is:"+d.grade);
		System.out.println("passed or not:"+d.passed);
		
	}

}
