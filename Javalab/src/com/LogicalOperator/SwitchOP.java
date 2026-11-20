package com.LogicalOperator;

import java.util.Scanner;

public class SwitchOP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the day");
		String d = sc.next();
		switch (d) {
		case "mon", "tues" -> System.out.println("schools days");
		case "wed", "sat" -> System.out.println("chill days");
		case "sun" -> {
			System.out.println("holiday");
			System.out.println("party day");
		}

		}
		System.out.println("Enter the number n ");
		int n =sc.nextInt();
		System.out.println("Enter the number m ");
		int m =sc.nextInt();
		System.out.println("enter the char or sybl + - * / %");
		String k = sc.next();
		
		switch (k) {
		case "+":
			int a = n + m;
			System.out.println(a);
		case "-":
			int a1 = n - m;	
			System.out.println(a1);
		}
		

	}
}
