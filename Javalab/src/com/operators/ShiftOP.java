package com.operators;

public class ShiftOP {
    public static void main(String[] args) {

        int a = 8;
        int b = -8;

        // 1. Left Shift Operator (<<)
        System.out.println("******** LEFT SHIFT (<<) ********");
        System.out.println(22<< 1); // 16
        System.out.println(a << 2); // 32
        System.out.println(a << 3); // 64

        // 2. Right Shift Operator (>>)
        System.out.println("\n******** RIGHT SHIFT (>>) ********");
        System.out.println(22 >> 1); // 4
        System.out.println(a >> 2); // 2
        System.out.println(a >> 3); // 1

        // Right shift with negative number
        System.out.println(b >> 1); // -4

        // 3. Unsigned Right Shift Operator (>>>)
        System.out.println("\n******** UNSIGNED RIGHT SHIFT (>>>) ********");
        System.out.println(22 >>> 1); // 4
        System.out.println(a >>> 2); // 2
        System.out.println(b >>> 1); // 2147483644
        System.out.println(b >>> 2); // 1073741822
    }
}
