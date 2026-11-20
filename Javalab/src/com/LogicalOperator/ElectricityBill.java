package com.LogicalOperator;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the bill type");
		String billtyp = sc.next();
		System.out.println("enter the consumed units ");
		int units = sc.nextInt();

		double total = 0;

		switch (billtyp) {
		case "Demoestic" -> {
			total = units * 5;
			System.out.println("the taotal amount for the demoesdtic is  : " + total);
		}
		case "Commercial" -> {
			total = units * 8;
			System.out.println("the taotal amount for the Commercial is  : " + total);
		}
		case "industrial" -> {
			total = units * 10;
			System.out.println("the taotal amount for the industrial  is  : " + total);
		}
		}

	}

}
