
package com.operators;

public class LogicalDemo {
	public static void main(String[] args) {

		int x = 10;
		int y = 15;
		int z = 20;

		System.out.println("**************and**************");
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false, 2nd condition skipped
		System.out.println(false && false); // false

		System.out.println(x < y && y < z); // true
		System.out.println(x < y && y > z); // false
		System.out.println(x > y && y < z); // false
		System.out.println(x > y && y > z); // false
		int a = 10;

		System.out.println(++a < 15 && ++a < 15);
		// true && true = true

		System.out.println(a); // 12

		System.out.println(++a > 15 && ++a < 15);
		// First condition false, second condition skipped

		System.out.println("**************not**************");

		System.out.println(a); // 13

		System.out.println(true || true); // true
		System.out.println(true || false); // true, 2nd condition skipped
		System.out.println(false || true); // true
		System.out.println(false || false); // false

		System.out.println(x < y || y < z); // true
		System.out.println(x > y || y < z); // true
		System.out.println(x > y || y > z); // false

		// Short-circuit with increment
		int b = 10;

		System.out.println(++b > 5 || ++b < 15);
		// First condition true, second condition skipped

		System.out.println(b); // 11
		System.out.println("**************not**************");

		System.out.println(!true); // false
		System.out.println(!false); // true

		System.out.println(!(x < y)); // false
		System.out.println(!(x > y)); // true

		System.out.println("Main method ended");
	}
}
