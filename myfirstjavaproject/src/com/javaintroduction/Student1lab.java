package com.javaintroduction;

public class Student1lab {
	
	static String collegename="saveetha";
	
	String studentname;
	int studentid;
	int studentmarks;
	
	

	public static void main(String[] args) {
		
		System.out.println(collegename);   
		
		Student1lab s=new Student1lab();
		s.studentname="charan";
		s.studentid=34;
		s.studentmarks=100;
		
		
		System.out.println(s.studentname);
		System.out.println(s.studentid);
		System.out.println(s.studentmarks);

	}

}
