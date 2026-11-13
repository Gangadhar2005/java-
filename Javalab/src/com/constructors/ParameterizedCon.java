
package com.constructors;

public class ParameterizedCon {

    int id;
    String name;

    // No-Argument Constructor
    ParameterizedCon() { 
    	
        System.out.println("No-Argument Constructor");
    }

    // Parameterized Constructor
    ParameterizedCon(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Parameterized Constructor");
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        ParameterizedCon c1 = new ParameterizedCon();
        ParameterizedCon c2 = new ParameterizedCon( 22 , "ram");
        c2.display();
    }
}
