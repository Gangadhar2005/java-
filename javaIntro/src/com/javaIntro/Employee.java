package com.javaIntro;

public class Employee {
	static String companyName = "tcs ";

	int idNo;
	String department;
	int salary;
	String name;

	public static void main(String[] args) {

		System.out.println(" object 1");

		Employee dev = new Employee();
		dev.idNo = 4;
		dev.department = " develop";
		dev.salary = 900000;
		dev.name = " Raghu";
		System.out.println("Employee id =" + dev.idNo);
		System.out.println("Employee name =" + dev.name);
		System.out.println("Employee  dept = " + dev.department);
		System.out.println("Employee name = " + dev.name);
		System.out.println("Employee companyName = " + Employee.companyName);

		System.out.println(" object 2");
		Employee hr = new Employee();
		hr.idNo = 5;
		hr.department = "hiring";
		hr.salary = 1000000;
		hr.name = "gopi";
		System.out.println("Employee id =" + hr.idNo);
		System.out.println("Employee name =" + hr.name);
		System.out.println("Employee  dept = " + hr.department);
		System.out.println("Employee name = " + hr.name);
		System.out.println("Employee companyName = " + Employee.companyName);
		
	    companyName = "hcl";

		System.out.println(" object 1");

		Employee lab = new Employee();
		lab.idNo = 23;
		lab.department = " tech";
		lab.salary = 800000;
		lab.name = "abdul";
		System.out.println("Employee id =" + lab.idNo);
		System.out.println("Employee name =" + lab.name);
		System.out.println("Employee  dept = " + lab.department);
		System.out.println("Employee name = " + lab.name);
		System.out.println("Employee companyName = " + Employee.companyName);

	}

}
