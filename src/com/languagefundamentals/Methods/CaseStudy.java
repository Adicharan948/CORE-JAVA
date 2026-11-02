package com.languagefundamentals.Methods;

public class CaseStudy {
	
	
	int id;
	String name;
	double salary;
	
	
	CaseStudy(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	
	double bonus() {
		return salary *0.10;
	}
	
	double totalsalary() {
		return salary+bonus();
	}
	
	void display() {
		System.out.println("id is:"+id);
		System.out.println("name is:"+name);
		System.out.println("salary is:"+salary);
		System.out.println("bonus is:"+bonus());
		System.out.println("total salary is:"+totalsalary());
	}

	public static void main(String[] args) {
		
		CaseStudy s=new CaseStudy(1,"Charan",10000);
		s.bonus();
		s.totalsalary();
		s.display();

	}

}
