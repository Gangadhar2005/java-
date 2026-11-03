package methods;

public class NoreturntypeNoprameters {
	void name() {
		System.out.println("Gangadhar");
	}

	void Roll() {
		System.out.println("101");
	}

	void Age() {
		System.out.println("22");
	}

	static void Branch() {
		System.out.println("CSE");
	}

	static void College() {
		System.out.println("KARE");
	}

	public static void main(String[] args) {

		NoreturntypeNoprameters Student = new NoreturntypeNoprameters();
		Student.name();
		Student.Roll();
		Student.Age();
		Branch();
		College();
	}
}
