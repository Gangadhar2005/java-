package com.LogicalOperator;

import java.util.Scanner;

public class TestYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String t = " ";
		do {
			System.out.println("enter the year :");
			int year = sc.nextInt();
			if ((year % 4 == 0) && (year % 100 != 0)) {
				System.out.println("the year is leapyear");
			} else {
				System.out.println("year is not leap year");
			}
			System.out.println("you check next year leap or not means yes means y and no means n");
			t = sc.next();

		} while (t.equalsIgnoreCase("y"));
	}

}
