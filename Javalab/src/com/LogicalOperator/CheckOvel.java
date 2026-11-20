package com.LogicalOperator;

import java.util.Scanner;

public class CheckOvel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values ");
		char ch = sc.next().charAt(0);
		
        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' ||
            ch == 'O' || ch == 'U') {

            System.out.println("Vowel");
        }
        else {
            System.out.println("consonant");
        }
    }
}
