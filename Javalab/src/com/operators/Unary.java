package com.operators;

class Unary {
    public static void main(String[] args) {
        int a = 4, b = 6;

        System.out.println(+a);// positive data 4
        System.out.println(-b);// negative data 6
        System.out.println(a++);//a = a + 1 = 4 --> 5 post increment
        System.out.println(++a);//a = a  + 1 = 6 pre increment 
        System.out.println(--b);//pre decrement 5
        System.out.println(b--);//post decrement 5
        System.out.println(a);//6
        System.out.println(b);//4
        System.out.println(++a + ++b + --a + --b );//7 + 5 + 6 + 4 -22
    }
    
} 