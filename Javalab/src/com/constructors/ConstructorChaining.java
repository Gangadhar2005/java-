
package com.constructors;

// Parent Class
class Parent {

    Parent() {
        System.out.println("Parent No-Argument Constructor");
    }

    Parent(int id) {
        System.out.println("Parent Parameterized Constructor: " + id);
    }
}

// Child Class
public class ConstructorChaining extends Parent {

    ConstructorChaining() {
		this(101);
        System.out.println("Child No-Argument Constructor");
    }

    ConstructorChaining(int id) {
        super(102);
        System.out.println("Child Parameterized Constructor: " + id);
    }

    public static void main(String[] args) {

        ConstructorChaining c1 = new ConstructorChaining();
    }
}
