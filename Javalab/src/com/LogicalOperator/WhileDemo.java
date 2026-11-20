package com.LogicalOperator;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		int m ;
		do {
			Scanner sc = new Scanner(System.in);
				    System.out.println("enter the values ");
				     m = sc.nextInt();

		    if (m % 2 == 0) {
		        System.out.println("Even Number");
		    } else {
		        System.out.println("Odd Number");
		    }
		      m++;
		}while(m <= 10);

		
	}
}
