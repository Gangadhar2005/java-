package com.constructors;

public class Student {
	double studid;
	String name;
	int studentroll;
	Student (){
		System.out.println("no arg constructor");
		studid = 100;
		name = "vishnu";
		studentroll =10;		
	}
	Student(int a, String b , int c){
		 studid = a;
		 name = b;
		 studentroll = c;	
	}
	Student(double studid , String name, int studentroll){
		this.studid = studid;
		this.name = name;
		this.studentroll = studentroll;	
	}
	void student() {
		System.out.println(studid);
		System.out.println(name);
		System.out.println(studentroll);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Student s = new Student();
		s.student();
		Student s1 = new Student(2,"Ram",22);
		s1.student();
		Student s2 = new Student(5,"rao",89);
		s2.student();
		System.out.println("main method ended");
		
	}

}
