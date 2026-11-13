
package com.constructors;

public class CopyConstructor {

	int id;
	String name;
	double salary;

	// Parameterized Constructor
	CopyConstructor(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Copy Constructor
	CopyConstructor(CopyConstructor obj) {
		this.id = obj.id;
		this.name = obj.name;
		this.salary = obj.salary;
	}

	void display() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}

	public static void main(String[] args) {

		// Original Object
		CopyConstructor c1 = new CopyConstructor(101, "Gangadhar", 25000);

		// Copy Object
		CopyConstructor c2 = new CopyConstructor(c1);

		System.out.println("Original Object:");
		c1.display();

		System.out.println(" Copied Object:");
		c2.display();
	}
}
