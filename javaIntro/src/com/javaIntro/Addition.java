package com.javaIntro;

public class Addition {
	
	int add(int a , int b) {
		return a + b;	
	}
	int add(int a , int b,int c) {
		return a + b + c;	
	}
	double add(double a , double b) {
		return a + b;	
	}


	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Addition twoNum = new Addition();
		System.out.println(twoNum.add(10,15));
		System.out.println(twoNum.add(10,15,10));
		System.out.println(twoNum.add(10.5,15.0));

	}

}
