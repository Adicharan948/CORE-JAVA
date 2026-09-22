package com.javaintroduction;

public class Forclass {

	public static void main(String[] args) throws ClassNotFoundException{
		
//bootstrap class loader will load this package files or pre defined class
		System.out.println(Class.forName("java.lang.String"));
      
        System.out.println( Class.forName("java.lang.System"));
        
        
// Application class loader will load our cls files and third party files
        
        System.out.println("student");

	}

}
