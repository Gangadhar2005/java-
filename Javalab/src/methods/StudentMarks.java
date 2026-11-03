package methods;

import java.util.Scanner;

public class StudentMarks {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StudentMarks st = new StudentMarks();
		st.totalmarks();
		int a = st.marks();
		st.avg(a);
	}

	int marks() {
		System.out.println("enter values : ");
		int chy = sc.nextInt();
		System.out.println("enter values : ");
		int math = sc.nextInt();
		System.out.println("enter values : ");
		int phy = sc.nextInt();
		int marks = chy + math + phy;
		System.out.println("marks of students : " + marks);
		return marks;
	}

	void avg(int a) {
		int avg = a / 3;
		System.out.println("avg value : " + avg);
	}

	void totalmarks() {
		int b = 300;
		System.out.println("total marks is : " + b);

	}

}
