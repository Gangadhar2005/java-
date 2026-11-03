package methods;

public class Withreturntypenoprameters {

	public static void main(String[] args) {
		Withreturntypenoprameters t1 = new Withreturntypenoprameters();
		t1.getStudentName(); 
		t1.getRollNumber();
		t1.getage();
		getColleagename();
		t1.Totalmarks();

	}

	String getStudentName() {
		String name = "Gangadhar";
		System.out.println("name of student : " + name);
		return name;
	}

	int getRollNumber() {
		int roll = 20;
		System.out.println("roll of student : " + roll);
		return roll;

	}

	int getage() {
		int age = 22;
		System.out.println("age of student : " + age);
		return age;
	}

	static String getColleagename() {
		String colleage = "KARE";
		System.out.println("colleage name is : " + colleage);
		return colleage;
	}

	int Totalmarks() {
		int marks = 240;
		System.out.println("Total marks is : " + marks);
		return marks;
	}

}
