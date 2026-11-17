package com.LogicalOperator;

import java.util.Scanner;

public class TestVoteing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the age :");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("your elgible for the voteing");
			
		}else {
			System.out.println("sorry your age below 18 so your not elgible for the voteing");
		}

	}

}
