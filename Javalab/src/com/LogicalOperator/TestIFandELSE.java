package com.LogicalOperator;

import java.util.Scanner;

public class TestIFandELSE {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age :");
		int t = sc.nextInt();

		if (t >= 0 && t <= 10) {
			System.out.println("nvu pilla bacha");
		} else if (t > 10 && t <= 18) {
			System.out.println("china porodu");
		} else if (t >= 19 && t <= 26) {
			System.out.println("pedodivi avthunav betty");
		} else if (t >= 26 && t <= 31) {
			System.out.println("peliki vasyasu vachindi ra neku");
		} else if (t >= 32 && t <= 49) {
			System.out.println("hi how are you uncle ......just kidding ");
		} else if (t > 50  && t < 60) {
			System.out.println("musaloda tablet veskunava");
		} else {
			System.out.println("baythike unava inka thatha ");
		}

	}

}
