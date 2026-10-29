/*
Create a Student class using:

* Static Block – Print college name.
* Instance Block – Print "Student object created".
* Instance Method – Display student details.
* Static Method – Display college details.
* Create 2 Student objects in main() and call all methods.
* Student fields: rollNo, name, marks.
*/

package com.languagefundamentals;

class Student {

    int rollNo;
    String name;
    int marks;

  
    static {
        System.out.println("College Name:saveetha");
    }

  
    {
        System.out.println("Student object created");
    }

   //constructor
    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

   //instance method
    void displayStudentDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

   //Static method
    static void displayCollegeDetails() {
        System.out.println("College: ABC Engineering College");
    }

    public static void main(String[] args) {

       
        Student s1 = new Student(101, "Rahul", 85);

       
        Student s2 = new Student(102, "Priya", 90);

     
        s1.displayStudentDetails();
        s2.displayStudentDetails();

       
    }
}
