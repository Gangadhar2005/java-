package com.operators;

class ComparOperator {
	public static void main(String[] args) {

		System.out.println("Main method started");

		// String comparison (Object type)
		String s1 = new String("Java");
		String s2 = new String("Java");

		System.out.println(s1 == s2); // false: compares addresses
		System.out.println(s1.equals(s2)); // true: compares content
		System.out.println(s1.equalsIgnoreCase(s2)); // true: ignores case

		// Integer comparison (Primitive type)
		int a = 10;
		int b = 20;
		int c = 10;

		System.out.println(a == c); // true: equal
		System.out.println(a != b); // true: not equal
		System.out.println(a > b); // false: greater than
		System.out.println(a < b); // true: less than
		System.out.println(a >= c); // true: greater than or equal
		System.out.println(a <= b); // true: less than or equal

		System.out.println("Main method ended");
	}
}

