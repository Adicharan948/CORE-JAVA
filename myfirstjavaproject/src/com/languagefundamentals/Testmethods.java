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
		
		Testmethods b1=new Testmethods();
		b1.name="ssi";
		b1.rollno=13;
		b1.course="JAVA";
		b1.sub1marks=83;
		b1.sub2marks=90;
		b1.sub3marks=99;
		
		b1.displaystudents();
		b1.total();
		b1.avg();

	}

}
