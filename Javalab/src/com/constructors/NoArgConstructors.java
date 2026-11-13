
package com.constructors;

public class NoArgConstructors {

    String name;
    int age;
    String course;

    // No-Argument Constructor
    NoArgConstructors() {
        name = "Gangadhar";
        age = 21;
        course = "Java";
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {

        NoArgConstructors s1 = new NoArgConstructors();

        s1.displayDetails();
    }
}
