package com.poc;

import java.util.Scanner;

public class Naukri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" hello!! whats your name ? ");
		String name = sc.nextLine();
		System.out.println("good morning sir my name is : " + name);
		System.out.println("where your highest garduation completed ?");
		String clg = sc.nextLine();
		System.out.println("sir i completed my graduation in " + clg);
		System.out.println("whats your btech percentage :");
		double per = sc.nextDouble();
		if (per >= 70) {
			System.out.println("oh nice ");
			System.out.println(" how much experience in IT felid ");
			int exp = sc.nextInt();
			if (exp >= 2) {
				System.out.println("good !!! ");
				System.out.println("enter your age :");
				int age = sc.nextInt();
				if (age >= 21 && age <= 30) {
					System.out.println("ok...then we discuss how much salary expecting ?");
					Long sal = sc.nextLong();
					if (sal <= 800000) {
						System.out.println("good ");
						System.out.println("Do you have good communication skills?");
						boolean com = sc.nextBoolean();
						if (!com) {
							System.out.println("Sorry!!");
							System.out.println("You need to improve your communication skills.");

						} else {
							System.out.println("Congratulations!!");
							System.out.println("Your profile is shortlisted!");
							System.out.println("You are eligible for the Technical Interview.");
							System.out.println("Welcome to Vcube Technologies!");
						}
					} else {
						System.out.println("Your salary expectations are beyond our company budget.");
					}

				} else {
					System.out.println("sorry we are searching for below 30");
				}
			} else {
				System.out.println("Otherwise: \"You need to improve your  skills.");
			}
		} else {
			System.out.println("Otherwise Sorry! Your academic percentage is not matching ");
		}

	}

}
