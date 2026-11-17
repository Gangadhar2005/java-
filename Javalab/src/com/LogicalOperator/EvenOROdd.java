package com.LogicalOperator;

import java.util.Scanner;

public class EvenOROdd {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Using Modulus Operator (%)
		System.out.println("enter the values ");
		int m = sc.nextInt();

		if (m % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
		System.out.println("********************");
		// Using Bitwise AND (&)
		System.out.println("enter the values ");
		int n = sc.nextInt();

		if ((n & 1) == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
		System.out.println("********************");
		// Using Bitwise XOR (^)
		System.out.println("enter the values ");
		int p = sc.nextInt();
		if ((p ^ 1) == p + 1) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
        //Using Bitwise OR (|)
		System.out.println("********************");
		System.out.println("enter the values ");
		int r= sc.nextInt();
		if (( r | 1) == r) {
		    System.out.println("Odd Number");
		} else {
		    System.out.println("Even Number");
		}
        //Using Ternary Operator (?:)
		System.out.println("********************");
		System.out.println("enter the values ");
		int d = sc.nextInt();
		String result = (d % 2 == 0) ? "Even" : "Odd";
		System.out.println(result);
        //Using Division (/) and Multiplication (*)
		System.out.println("********************");
		int s = sc.nextInt();
		if ((s / 2) * 2 == r) {
		    System.out.println("Even Number");
		} else {
		    System.out.println("Odd Number");
		}
	}
}
