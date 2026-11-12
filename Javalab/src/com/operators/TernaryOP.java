package com.operators;

import java.util.Scanner;

public class TernaryOP {
	public static void main(String[] args) {
		int m = 9;
		int n = 0;
		int lar = (m > n) ? m : n;
		System.out.println("largest of two number is : " + lar);
		Scanner sc = new Scanner(System.in);
		System.out.println("a = ");
		int a = sc.nextInt();
		System.out.println("b = ");
		int b = sc.nextInt();
		System.out.println("c = ");
		int c = sc.nextInt();
		// Ternary Operator
		int largest = (a > b & a > c) ? a : (b > a & b > c) ? b : c;
		System.out.println("Largest of three number is: " + largest);

	}
}