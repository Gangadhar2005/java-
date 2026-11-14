package com.javaIntro;

public class Colleage {
	static String collegeName =" KLU";
	static String principalName = " KCR";
	
	String studentName;
	int studentId;
	int marks;
	String courseName;
	
	void displayStudentDetails() {
		System.out.println("studentName = " + studentName );
		System.out.println("studentId= " + studentId );
		System.out.println(" studentmarks = " + marks);
		System.out.println("courseName =" + courseName );
	}
	static void displayColleageDetails() {
		System.out.println("collegeName = " + Colleage.collegeName);
		System.out.println("principalName = " + Colleage.principalName);
	}
	void changePrinciple(String newprinciple) {
		principalName=newprinciple;	
	}

	public static void main(String[] args) {
		Colleage s14 = new Colleage ();
		s14.studentId = 10;
		s14.studentName = "Raghu";
		s14.courseName = "CSE";
		s14.marks= 98;
		s14.displayStudentDetails();
		s14.changePrinciple("Revanth");
		Colleage.displayColleageDetails();

	}
}
