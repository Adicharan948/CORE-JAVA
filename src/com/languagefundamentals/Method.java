package com.languagefundamentals;

public class Method {

	int rollno;
	String name;
	double marks;

	static {
		System.out.println("College Name:saveetha");

		{
			System.out.println("Student object created");
		}

	}
	
	
	//instance method
	
	void displaystudentdetails() {
		System.out.println("Rollno:"+rollno);
		System.out.println("Name is:"+name);
		System.out.println("Marks Is:"+marks);
		
	}
	
	static void displaycollegedetails() {
		System.out.println("College Name:saveetha");
	
	}
	
	

	public static void main(String[] args) {
		
	
		
		
		Method s1=new Method();
		s1.rollno=1;
		s1.name="sai";
		s1.marks=78;
		s1.displaystudentdetails();
		
		Method s2=new Method();
		s2.rollno=2;
		s2.name="babi";
		s2.marks=98;
		s2.displaystudentdetails();
		
	}

}
