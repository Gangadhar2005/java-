package com.javaIntro;

public class Garbage {
	@Override
	protected void finalize() {
		System.out.println("finalize clling");
	}

	void sir() {
		Garbage nef = new Garbage();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Garbage s1 = new Garbage();
//		Garbage s2 = new Garbage();
//		Garbage s3 = new Garbage();
//		Garbage s5 = new Garbage();
//
//		System.out.println(s1);
		// nullifying
		// s1 = null;
		// reassigning

//		s2 = s3;
//		System.out.println(s2);
//		System.out.println(s3);

		// s5.sir();
		// System.out.println(s5);

		new Garbage().sir();
		System.gc();

	}

}
