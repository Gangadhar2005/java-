package methods;

public class NoreturntypeWithprameters {
	static void addition(int m, int n) {
		System.out.println("Addition method called ");
		System.out.println("sum of two number is : " + (m + n));
	}

	void subtraction(float m, int n) {
		System.out.println("subtraction method called  ");
		System.out.println("Difference between two numbers is : " + (m - n));
	}

	void multiplication(float m, float n, float o) {
		System.out.println("Multplication method called ");
		System.out.println("Product of two numbers : " + (m * n * o));
	}

	static void division(float m, float n) {
		System.out.println("Division ");
		System.out.println("Quotient of Three numbers : " + m / n);
	}

	static void modulus(double d1, double d2) {
		System.out.println("Modulus method called ");
		System.out.println("Reminder of two numbers : " + d1 % d2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoreturntypeWithprameters a = new NoreturntypeWithprameters();
		addition(23,50);
		a.subtraction(50, 20);
		a.multiplication(5, 6, 8);
		modulus(9,3);
	}

}
