package com.languagefundamentals;

public class Testmethods {
	
	String name;
	int rollno;
	String course;
	int sub1marks;
	int sub2marks;
	int sub3marks;
	int total;
	int avg;
	
	void displaystudents() {
		System.out.println("display student details");	
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(course);
	}

	void total() {
		total=sub1marks+sub2marks+sub3marks;
		System.out.println(total);
	}
	
	void avg() {
		avg=total/3;
		System.out.println(avg);
	}

	public static void main(String[] args) {
		
		Testmethods b=new Testmethods();
		b.name="sai";
		b.rollno=123;
		b.course="JAVA";
		b.sub1marks=89;
		b.sub2marks=90;
		b.sub3marks=99;
		
		
		b.displaystudents();
		b.total();
		b.avg();

	}

}
