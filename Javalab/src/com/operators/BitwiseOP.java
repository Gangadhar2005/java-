package com.operators;

public class BitwiseOP {
	
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        // 1. Bitwise AND (&)
        System.out.println("******** BITWISE AND (&) ********");
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & true);
        System.out.println(false & false);

        System.out.println(1 & 1); // 1
        System.out.println(1 & 0); // 0
        System.out.println(0 & 1); // 0
        System.out.println(0 & 0); // 0
        System.out.println(a & b); // 1


        // 2. Bitwise OR (|)
        System.out.println("\n******** BITWISE OR (|) ********");
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | true);
        System.out.println(false | false);

        System.out.println(1 | 1); // 1
        System.out.println(1 | 0); // 1
        System.out.println(0 | 1); // 1
        System.out.println(0 | 0); // 0
        System.out.println(a | b); // 7


        // 3. Bitwise XOR (^)
        System.out.println("\n******** BITWISE XOR (^) ********");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println(1 ^ 1); // 0
        System.out.println(1 ^ 0); // 1
        System.out.println(0 ^ 1); // 1
        System.out.println(0 ^ 0); // 0
        System.out.println(a ^ b); // 6


        // 4. Bitwise Complement (~) --~1=-(n+1) =-(1+1) = -2
        System.out.println("\n******** BITWISE COMPLEMENT (~) ********");
        System.out.println(~5);   // -6
        System.out.println(~10);  // -11
        System.out.println(~0);   // -1
        System.out.println(~1); // -2
    }
}
