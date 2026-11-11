package com.Accessmodifier2;

public class Enclapsulation {
	
	
	private int id;
	private String name;
	
	public void setid(int id) {
		this.id=id;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public int getid() {
		return id;
	}
	
	public String getname() {
		return name;
	}

	public static void main(String[] args) {
		
		Enclapsulation e=new Enclapsulation();
		
		e.setid(110);
		e.setname("charan");
		
		System.out.println(e.getid());
		System.out.println(e.getname());

	}

}
