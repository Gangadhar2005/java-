package com.javaIntro;

class A {
	B b;

	@Override
	protected void finalize() {
		System.out.println("final");
	}

}

class B {
	A a;

	protected void finalize() {
		System.out.println("final");
	}

}

class C {
	D d;

	protected void finalize() {
		System.out.println("final");
	}

}

class D {
	C c;

	protected void finalize() {
		System.out.println("final");
	}
}

public class Islandgc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A b1 = new A();
		B a1 = new B();
		C d1 = new C();
		D c1 = new D();

		b1.b = a1;
		a1.a = b1;
		d1.d = c1;
		c1.c = d1;

		a1 = null;
		b1 = null;
		c1 = null;
		d1 = null;
		System.gc();

	}

}