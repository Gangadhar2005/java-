package com.javaIntro;

public class Bank {

	static String bankName = " hdfc";

	int AccountNO;
	int balance;
	String holaderName;

	void display() {

		System.out.println("AccountNO= " + AccountNO);
		System.out.println(" balance = " + balance);
		System.out.println(" holaderName = " + holaderName);
		System.out.println(" bankName = " + Bank.bankName);

	}

	public static void main(String[] args) {

		Bank HR = new Bank();
		HR.AccountNO = 123445566;
		HR.balance = 500000;
		HR.holaderName = "vishnu";
		HR.display();

	}

}
