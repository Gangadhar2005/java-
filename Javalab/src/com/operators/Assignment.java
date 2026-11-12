package com.operators;

//= += -= *= /= %=
class Assignment {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
 
        a += 5.5;//no need of type casting here 
        System.out.println(a);//15

        a -= 3.5;//15 - 3 = 12 -0.5 = 11.5 = 11
        System.out.println(a);

        a *= 2.5;//11*2 = 22 & 11 * 0.5 = 5.5 then 22+5.5 = 27.5 = 27
        System.out.println(a);
        a /= 2.5;//27/2.5 = 270/25=10.8 = 10 
        System.out.println(a);
        a %= 1.5 ;//10%1.5 = 1
        System.out.println(a);
        }
}
